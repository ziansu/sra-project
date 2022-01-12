public java.lang.String cleanEmail(android.widget.EditText email) {
    return email.getText().toString().replaceAll("\\.", "");
}