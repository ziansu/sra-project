public boolean validFields() {
    return ((etConfirmPassword.getText().toString().equals(etPassword.getText().toString())) && ((etUsername.getText().toString().length()) > 0)) && ((etPassword.getText().toString().length()) > 0);
}