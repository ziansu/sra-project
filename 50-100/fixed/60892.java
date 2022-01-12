private void logIn(java.lang.String login, java.lang.String password) {
    if (validate(login, password)) {
        new com.veinhorn.rwbytickets.auth.AuthLoader(this).execute();
    }else {
        android.widget.Toast.makeText(this, "Empty login/password", Toast.LENGTH_SHORT).show();
        loginEditText.setText("");
        passwordEditText.setText("");
    }
}