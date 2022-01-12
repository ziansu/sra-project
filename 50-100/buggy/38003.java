@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    android.util.Log.d(com.bros.freetime.LoginActivity.TAG, ("facebook:onSuccess:" + loginResult));
    if (BuildConfig.DEBUG) {
        com.facebook.FacebookSdk.setIsDebugEnabled(true);
        com.facebook.FacebookSdk.addLoggingBehavior(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
        android.util.Log.d(com.bros.freetime.LoginActivity.TAG, ("handleFacebookAccessToken:" + (loginResult.getAccessToken())));
        handleFacebookAccessToken(loginResult.getAccessToken());
    }
}