public void setText(android.view.View view) {
    android.widget.EditText editText = ((android.widget.EditText) (findViewById(R.id.edit_message)));
    android.widget.TextView textField = ((android.widget.TextView) (findViewById(R.id.textField)));
    java.lang.String message = editText.getText().toString();
    textField.setText(message);
}