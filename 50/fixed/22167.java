@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    isUserLoggedIn = true;
    saveLoginState(isUserLoggedIn);
}