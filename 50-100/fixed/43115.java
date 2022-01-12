@java.lang.Override
public void onClick(android.view.View view) {
    if (isValidPassword(oldPassword.getText().toString(), password.getText().toString(), confirmPswd.getText().toString())) {
        savePassword(password.getText().toString());
        finish();
    }else {
        oldPassword.setText("");
        password.setText("");
        confirmPswd.setText("");
        oldPassword.requestFocus();
    }
}