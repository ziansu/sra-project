@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    accessToken = loginResult.getAccessToken();
    userProfile = com.facebook.Profile.getCurrentProfile();
    if ((userProfile) != null) {
        com.andela.bark.models.User user = com.andela.bark.models.User.createFacebookUser(userProfile);
        com.andela.bark.GKprManger gKprManger = new com.andela.bark.GKprManger(user);
        if (gKprManger.isAuthenticated) {
            android.content.Intent i = new android.content.Intent(activity, com.andela.bark.FragmentHostActivity.class);
            activity.startActivity(i);
        }
    }
}