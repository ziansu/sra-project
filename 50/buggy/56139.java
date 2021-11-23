private void notifyError(int resourceString, java.lang.String error) {
    txtPassword.setText("");
    java.lang.String msgError = java.lang.String.format(getString(R.string.login_error_message_signup), error);
    txtPassword.setError(msgError);
}