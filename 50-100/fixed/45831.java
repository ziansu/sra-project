public void clearFields() {
    android.widget.EditText name = ((android.widget.EditText) (findViewById(R.id.fieldName)));
    name.setText("");
    android.widget.EditText subject = ((android.widget.EditText) (findViewById(R.id.fieldSubject)));
    subject.setText("");
    android.widget.EditText message = ((android.widget.EditText) (findViewById(R.id.fieldMessage)));
    message.setText("");
}