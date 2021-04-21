//TextField
import java.awt.*;  
class staffs

{  
	public static void main(String args[])
	{  
    		Frame f= new Frame("LIBRARY MANAGEMENT SYSYEM");  

		//Labels
		Label l1,l2,l3,l4,l5;  
    		l1=new Label("Name");  
   		    l1.setBounds(50,100, 100,30); 
 
    		l2=new Label("Contact");  
    		l2.setBounds(50,150, 100,30);  

    		l3=new Label("Id");  
   		    l3.setBounds(50,200, 100,30); 
 

    		l4=new Label("STAFFS");  
    		l4.setBounds(330,20,100,50);  

    		l5=new Label("Gender");  
    		l5.setBounds(50,250,100,30);  

    		f.add(l1); 
			f.add(l2);   
			f.add(l3); 
			f.add(l4);
			f.add(l5);   
			 
		//TextField
		TextField t1,t2,t3,t4;  
    		t1=new TextField();  //Textbox
    		t1.setBounds(160,100, 100,30);  

    		t2=new TextField();  
    		t2.setBounds(160,150, 100,30); 

    		t3=new TextField();  //Textbox
    		t3.setBounds(160,200, 100,30); 

    		t4=new TextField();  //Textbox
    		t4.setBounds(160,250, 100,30); 

    		
    		f.add(t1); 
			f.add(t2);  
			f.add(t3); 
			f.add(t4); 
			
		//Buttons
		Button b1, b2 , b3 ,b4;
		b1=new Button("Save");  
		b1.setBounds(50,300,60,40); 
	
		b2=new Button("Modify");  
		b2.setBounds(120,300,60,40);

		b3=new Button("Delete");  
		b3.setBounds(190,300,60,40); 
	
		b4=new Button("Cancel");  
		b4.setBounds(260,300,60,40); 
		 
		f.add(b1);  
		f.add(b2); 
		f.add(b3);  
		f.add(b4);

		f.setSize(700,500);  
    		f.setLayout(null);  
    		f.setVisible(true);  
	}  
}  