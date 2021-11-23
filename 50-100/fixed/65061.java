public boolean isValidFirstName() {
    java.lang.Boolean isValid = true;
    java.lang.String firstName = firstNameET.getText().toString().trim();
    if ((firstName.length()) == 0) {
        tilFirstName.setError("Field cannot be blank");
        isValid = false;
    }else
        if (!(firstName.matches("[a-zA-Z ]+"))) {
            tilFirstName.setError("Enter valid First Name");
            isValid = false;
        }else {
            tilFirstName.setError(null);
        }
    
    return isValid;
}