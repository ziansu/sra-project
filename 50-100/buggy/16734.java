public void Is_Valid_Email(android.widget.EditText edt) {
    if ((edt.getText().toString()) == null) {
        edt.setError("Invalid Email Address");
        valid_email = null;
    }else
        if ((isEmailValid(edt.getText().toString())) == false) {
            edt.setError("Invalid Email Address");
            valid_email = null;
        }else {
            valid_email = edt.getText().toString();
        }
    
}