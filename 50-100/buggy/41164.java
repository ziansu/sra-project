public boolean isValidSchoolName() {
    java.lang.Boolean isValid = true;
    java.lang.String college = collegeET.getText().toString().trim();
    if (college.isEmpty()) {
        tilSchoolName.setError("Field cannot be blank");
        isValid = false;
    }else
        if (!(college.matches("[a-zA-Z ]+"))) {
            tilSchoolName.setError("Enter valid School/College Name");
            isValid = false;
        }else {
            tilSchoolName.setErrorEnabled(false);
        }
    
    return isValid;
}