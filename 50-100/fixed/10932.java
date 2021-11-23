public void loginButtonPressed(android.view.View v) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    hideKeyboard();
    loginInfo.setText("");
    accountName = inputUsername.getText().toString();
    password = inputPassword.getText().toString();
    if ((!(accountName.equals(""))) && (!(password.equals("")))) {
        loginProgressBar.setVisibility(View.VISIBLE);
        thorleifz.wakeup.LogIn.LoginTask loginTask = new thorleifz.wakeup.LogIn.LoginTask();
        loginTask.execute();
    }
}