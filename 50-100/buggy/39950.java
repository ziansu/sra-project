@java.lang.Override
public void onClick(android.view.View view) {
    int d = java.lang.Integer.parseInt(editTextDegree.getText().toString());
    d += 10;
    android.content.SharedPreferences.Editor editor = settings.edit();
    editor.putInt("degree", d);
    path = (((((sd) + "/") + (degree)) + "_Degree_") + (c.getTime())) + ".xml";
    editor.commit();
    editTextDegree.setText(java.lang.String.valueOf(d));
}