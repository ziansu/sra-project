private boolean validateEmail() {
    java.lang.String email = customerEmailEditText.getText().toString().trim();
    if ((!(Patterns.EMAIL_ADDRESS.matcher(email).matches())) && (!(email.isEmpty()))) {
        customerEmailEditText.setError(getString(R.string.enter_valid_email));
        return false;
    }else {
        customerEmailEditText.setError(null);
    }
    return true;
}