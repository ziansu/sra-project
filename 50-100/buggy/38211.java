@java.lang.Override
public void onRequestSuccess(com.goupwards.login.LoginResponse data) {
    com.goupwards.login.LoginData loginData = new com.goupwards.login.LoginData("upwards_6_HZ21g7leEI2qppJXF3A5Abh76HWqRh9n", "6");
    com.goupwards.login.AccountManager.getInstance().updateLoginData(loginData);
    com.goupwards.Rest.setSessionToken(com.goupwards.login.AccountManager.getInstance().getSessionToken());
    loginView.hideProgressDialog();
    loginView.openNextScreen();
}