public boolean checkText(android.widget.EditText e) {
    if ((e.getText().toString().length()) == 0) {
        e.setError("Cannot be empty");
        return false;
    }else {
        surname = e.getText().toString();
        return true;
    }
}