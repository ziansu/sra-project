private void setupLoginButton(android.view.View view) {
    com.facebook.login.widget.LoginButton mButtonLogin = ((com.facebook.login.widget.LoginButton) (view.findViewById(R.id.login_button)));
    mButtonLogin.setFragment(this);
    java.util.List<java.lang.String> permissions = java.util.Arrays.asList("public_profile", "user_friends");
    mButtonLogin.setReadPermissions(permissions);
    mButtonLogin.registerCallback(mCallbackManager, mFacebookCallback);
    mButtonLogin.performClick();
}