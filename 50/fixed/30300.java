@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    rememberEulaAccepted(context);
    login(serverText.getText().toString(), usernameEditText.getText().toString(), passwordEditText.getText().toString());
}