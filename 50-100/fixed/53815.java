private void facebookRegister() {
    callbackManager = CallbackManager.Factory.create();
    com.facebook.login.widget.LoginButton loginButton = ((com.facebook.login.widget.LoginButton) (findViewById(R.id.login_button)));
    loginButton.setReadPermissions(java.util.Arrays.asList("public_profile", "email", "user_birthday", "user_about_me", "user_photos"));
    loginButton.registerCallback(callbackManager, new com.facebook.FacebookCallback<com.facebook.login.LoginResult>() {
        @java.lang.Override
        public void onSuccess(final com.facebook.login.LoginResult loginResult) {
            facebookSignIn(loginResult.getAccessToken());
        }

        @java.lang.Override
        public void onCancel() {
        }

        @java.lang.Override
        public void onError(com.facebook.FacebookException e) {
        }
    });
}