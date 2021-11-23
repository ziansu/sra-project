@java.lang.Override
protected void onResume() {
    super.onResume();
    java.lang.System.out.println("Resume");
    mEmailEditText = ((android.widget.EditText) (findViewById(R.id.LoginUsername)));
    mPasswordEditText = ((android.widget.EditText) (findViewById(R.id.LoginPassword)));
    mEmailEditText.getText().clear();
    mPasswordEditText.getText().clear();
}