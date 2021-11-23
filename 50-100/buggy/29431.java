@java.lang.Override
public void onClick(android.view.View v) {
    get_email = email_et.getText().toString();
    get_password = password_et.getText().toString();
    get_confirmed_password = confirm_password_et.getText().toString();
    if ((get_password) != (get_confirmed_password))
        confirm_password_et.setError("Passwords did not match, please re-enter your password.");
    
    android.content.Intent registered = new android.content.Intent("bossharriscorporation.firebasedb.LoginActivity");
    startActivity(registered);
}