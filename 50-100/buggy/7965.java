@java.lang.Override
public void onClick(android.view.View view) {
    if ((!(description.equals(""))) && ((selection) == 1)) {
        uploadImage();
    }else
        android.widget.Toast.makeText(getApplicationContext(), "Please fill the form", Toast.LENGTH_SHORT).show();
    
}