public void signUp(android.view.View view) {
    android.content.Intent i = new android.content.Intent(this, com.bedidi.fawzi.olchat.SignUp.class);
    if ((usernameEditText.getText().length()) >= 1) {
        i.putExtra(com.bedidi.fawzi.olchat.MainActivity.EXTRA_MESSAGE, usernameEditText.getText().toString());
        android.util.Log.i("Main Activity", "Username sent to the Signup activity");
    }
    startActivity(i);
}