private boolean validateEmail() {
    java.lang.String email = customerEmailEditText.getText().toString().trim();
    if ((!(Patterns.EMAIL_ADDRESS.matcher(email).matches())) && (!(email.isEmpty()))) {
        customerEmailEditText.setError(getString(R.string.enter_valid_email));
        requestFocus(customerEmailEditText);
        return false;
    }else {
        customerEmailEditText.setError(null);
        requestFocus(customerEmailEditText);
    }
    return true;
}