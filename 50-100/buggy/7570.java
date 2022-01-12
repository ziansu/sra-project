private void loginToFacebookIfNeeded(java.util.List<amai.org.conventions.model.Update> updates) {
    initializeFacebookLoginButton();
    com.facebook.AccessToken accessToken = com.facebook.AccessToken.getCurrentAccessToken();
    if ((accessToken != null) && (!(accessToken.isExpired()))) {
        loginLayout.setVisibility(View.GONE);
        retrieveUpdatesListFromFacebookApi(accessToken);
    }else {
        loginLayout.setVisibility(View.GONE);
        com.facebook.login.LoginManager.getInstance().logInWithReadPermissions(this, java.util.Collections.singletonList("public_profile"));
    }
}