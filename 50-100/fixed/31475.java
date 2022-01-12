@java.lang.Override
public void onClick(android.view.View view) {
    int d = java.lang.Integer.parseInt(editTextDegree.getText().toString());
    d += 10;
    android.content.SharedPreferences.Editor editor = settings.edit();
    editor.putInt("degree", d);
    editor.commit();
    editTextDegree.setText(java.lang.String.valueOf(d));
}