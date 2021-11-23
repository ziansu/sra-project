public void OnAdd(android.view.View v) {
    android.widget.EditText edit = ((android.widget.EditText) (findViewById(R.id.editText)));
    total = edit.getText().toString();
    v1 = java.lang.Double.parseDouble(total);
    total = "";
    android.widget.Button button = ((android.widget.Button) (v));
    java.lang.String str = button.getText().toString();
    sign = str;
    edit.setText("");
}