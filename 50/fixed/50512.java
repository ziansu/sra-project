@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    goMainScreen();
    facebookLogin(loginResult);
}