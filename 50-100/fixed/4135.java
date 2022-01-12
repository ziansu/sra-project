public boolean isValidEmail() {
    java.lang.Boolean isValid;
    java.lang.String email = emailET.getText().toString().trim();
    if (email.isEmpty()) {
        tilEmail.setError("Field cannot be blank");
        isValid = false;
    }else {
        isValid = android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
        if (!isValid) {
            tilEmail.setError("Enter a valid Email Address");
        }else
            tilEmail.setError(null);
        
    }
    return isValid;
}