@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    currentUser = com.parse.ParseUser.getCurrentUser();
    if ((currentUser) != null) {
        showProfileLoggedIn();
    }
    this.finish();
}