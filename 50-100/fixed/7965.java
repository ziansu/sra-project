@java.lang.Override
public void onClick(android.view.View view) {
    if (((selection) == 1) || (!(description.equals("")))) {
        uploadImage();
    }else
        android.widget.Toast.makeText(getApplicationContext(), "Please fill the form", Toast.LENGTH_SHORT).show();
    
}