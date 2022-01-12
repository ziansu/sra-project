private void logOut() {
    com.parse.ParseUser.logOut();
    android.content.Intent takeToLogin = new android.content.Intent(this, com.example.android.ShoppingWithFriends.LoginActivity.class);
    takeToLogin.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    takeToLogin.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    takeToLogin.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
    startActivity(takeToLogin);
    finish();
}