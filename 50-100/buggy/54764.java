@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    com.facebook.Profile profile = com.facebook.Profile.getCurrentProfile();
    com.devsh.androidlogin.library.data.SharedData.putAccountProvider(com.devsh.androidlogin.library.FacebookLoginUtil.sContext, SharedData.PROVIDER_FACEBOOK);
    com.devsh.androidlogin.library.data.SharedData.putAccountId(com.devsh.androidlogin.library.FacebookLoginUtil.sContext, profile.getId());
    com.devsh.androidlogin.library.data.SharedData.putAccountIdToken(com.devsh.androidlogin.library.FacebookLoginUtil.sContext, loginResult.getAccessToken().getToken());
    com.devsh.androidlogin.library.data.SharedData.putAccountUserName(com.devsh.androidlogin.library.FacebookLoginUtil.sContext, profile.getName());
    com.devsh.androidlogin.library.data.SharedData.putAccountUserPhoto(com.devsh.androidlogin.library.FacebookLoginUtil.sContext, profile.getProfilePictureUri(200, 200).getPath());
    com.devsh.androidlogin.library.FacebookLoginUtil.loginResultCallback.onSuccess(loginResult);
}