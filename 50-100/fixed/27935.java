@java.lang.Override
protected void onRestart() {
    super.onRestart();
    android.widget.EditText usernameText = ((android.widget.EditText) (findViewById(R.id.username)));
    android.widget.EditText passwordText = ((android.widget.EditText) (findViewById(R.id.password)));
    java.lang.String uname = usernameText.toString();
    java.lang.String pwd = passwordText.getText().toString();
    user = new de.ecspride.data.User(uname, pwd);
}