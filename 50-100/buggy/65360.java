@java.lang.Override
protected java.lang.Boolean doInBackground() throws java.lang.Exception {
    boolean success = true;
    java.lang.String username = usernameField.getText();
    java.lang.String password = Security.Guard.scramblePassword(java.lang.String.valueOf(passwordField.getPassword()));
    if (checkUsername(username)) {
        Networking.Server.Player.getInstance().setUsername(username);
        success = true;
    }
    return success;
}