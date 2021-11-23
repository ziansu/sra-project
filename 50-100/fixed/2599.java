private boolean isValidPassword(java.lang.String password, java.lang.String confirmPassword) {
    if ((password.length()) < 6) {
        passwordInputTextView.setError("Please create a password containing at least 6 characters");
        mAuthProgressDialog.dismiss();
        return false;
    }else
        if (!(password.equals(confirmPassword))) {
            passwordInputTextView.setError("Passwords do not match");
            mAuthProgressDialog.dismiss();
            return false;
        }
    
    return true;
}