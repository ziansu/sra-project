@java.lang.Override
public void onClick(android.view.View view) {
    while (!(isValidPassword(oldPassword.getText().toString(), password.getText().toString(), confirmPswd.getText().toString()))) {
        oldPassword.setText("");
        password.setText("");
        confirmPswd.setText("");
        oldPassword.requestFocus();
    } 
    savePassword(password.getText().toString());
    finish();
}