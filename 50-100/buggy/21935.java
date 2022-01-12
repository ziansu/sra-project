@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((accessToken = com.facebook.AccessToken.getCurrentAccessToken()) == null) {
        mCallbackManager = CallbackManager.Factory.create();
        java.util.List<java.lang.String> permissions = java.util.Arrays.asList("public_profile", "user_friends");
        loginManager = com.facebook.login.LoginManager.getInstance();
        loginManager.logInWithReadPermissions(this, permissions);
        loginManager.registerCallback(mCallbackManager, mFacebookCallback);
    }else {
        settingTrackersAndView();
    }
    setContentView(R.layout.facebookdisplay);
}