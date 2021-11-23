private void loginToFacebookIfNeeded(java.util.List<amai.org.conventions.model.Update> updates) {
    initializeFacebookLoginButton();
    loginLayout.setVisibility(View.GONE);
    com.facebook.AccessToken accessToken = com.facebook.AccessToken.getCurrentAccessToken();
    if ((accessToken != null) && (!(accessToken.isExpired()))) {
        retrieveUpdatesListFromFacebookApi(accessToken);
    }else {
        com.facebook.login.LoginManager.getInstance().logInWithReadPermissions(this, java.util.Collections.singletonList("public_profile"));
    }
}