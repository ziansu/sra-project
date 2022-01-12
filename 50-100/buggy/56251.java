public boolean validFields() {
    return ((etConfirmPassword.getText().toString().equals(etPassword.getText().toString())) && ((etUsername.getText().toString().trim().length()) > 0)) && ((etPassword.getText().toString().trim().length()) > 0);
}