public void loginSuccess() {
    android.content.Intent intent = new android.content.Intent(this, com.seng480b.bumerang.activities.HomeActivity.class);
    com.facebook.login.LoginManager.getInstance().logInWithReadPermissions(this, java.util.Arrays.asList("public_profile"));
    startActivity(intent);
}