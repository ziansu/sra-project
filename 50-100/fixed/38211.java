@java.lang.Override
public void onRequestSuccess(com.goupwards.login.LoginResponse data) {
    com.goupwards.login.LoginData loginData = data.getData();
    com.goupwards.login.AccountManager.getInstance().updateLoginData(loginData);
    com.goupwards.Rest.setSessionToken(com.goupwards.login.AccountManager.getInstance().getSessionToken());
    loginView.hideProgressDialog();
    loginView.openNextScreen();
}