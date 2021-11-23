public void Is_Valid_Person_Name(android.widget.EditText edt) throws java.lang.NumberFormatException {
    if ((edt.getText().toString().length()) <= 0) {
        edt.setError("Accept Alphabets Only.");
        valid_name = null;
    }else
        if (!(edt.getText().toString().matches("[a-zA-Z ]+"))) {
            edt.setError("Accept Alphabets Only.");
            valid_name = null;
        }else {
            valid_name = edt.getText().toString();
        }
    
}