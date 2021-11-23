@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.EditText nameText = ((android.widget.EditText) (findViewById(R.id.actname)));
    java.lang.String name = nameText.getText().toString();
    if ((selectedImagePath) == null) {
        android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), "Select an image you must", Toast.LENGTH_SHORT);
        toast.show();
        return ;
    }
    helper.insertActivity(db, name, selectedImagePath);
    finish();
}