@java.lang.Override
public void onClick(android.view.View v) {
    if ((name.length()) <= 0) {
        android.widget.Toast.makeText(this, "Observer Name required!", Toast.LENGTH_SHORT).show();
    }else {
        patrolers.add(name.getText());
        android.widget.Toast.makeText(this, "Patroler added!", Toast.LENGTH_SHORT).show();
        alertDialog.dismiss();
    }
}