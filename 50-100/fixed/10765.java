public void Is_Valid_Person_Name(android.widget.EditText edt) throws java.lang.NumberFormatException {
    if ((edt.getText().toString().length()) <= 0) {
        valid_name = null;
    }else
        if (!(edt.getText().toString().matches("[a-zA-Z ]+"))) {
            valid_name = null;
        }else {
            valid_name = edt.getText().toString();
        }
    
}