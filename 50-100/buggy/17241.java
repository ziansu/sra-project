protected void fbInitConfig() {
    callbackManager = CallbackManager.Factory.create();
    final com.facebook.login.widget.LoginButton loginButton = ((com.facebook.login.widget.LoginButton) (findViewById(R.id.login_button)));
    loginButton.setReadPermissions("email", "public_profile", "user_location", "user_birthday", "user_education_history", "user_work_history");
    loginButton.registerCallback(callbackManager, new com.facebook.FacebookCallback<com.facebook.login.LoginResult>() {
        @java.lang.Override
        public void onSuccess(final com.facebook.login.LoginResult loginResult) {
            handleFacebookAccessToken(loginResult.getAccessToken());
        }

        @java.lang.Override
        public void onCancel() {
        }

        @java.lang.Override
        public void onError(com.facebook.FacebookException e) {
        }
    });
}