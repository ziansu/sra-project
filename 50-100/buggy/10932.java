public void loginButtonPressed(android.view.View v) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    loginProgressBar.setVisibility(View.VISIBLE);
    hideKeyboard();
    loginInfo.setText("");
    accountName = inputUsername.getText().toString();
    password = inputPassword.getText().toString();
    if ((!(accountName.equals(""))) && (!(password.equals("")))) {
        thorleifz.wakeup.LogIn.LoginTask loginTask = new thorleifz.wakeup.LogIn.LoginTask();
        loginTask.execute();
    }
}