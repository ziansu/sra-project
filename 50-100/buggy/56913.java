public void onClick(android.content.DialogInterface dialog, int id) {
    x = java.lang.Integer.parseInt(etmax.getText().toString());
    (x)++;
    c = java.lang.Integer.parseInt(etmin.getText().toString());
    if ((x) < (c)) {
        android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), "Der Anfangswert muss kleiner als der Endwert sein.", Toast.LENGTH_SHORT);
        toast.show();
        x = 201;
        c = 0;
    }
}