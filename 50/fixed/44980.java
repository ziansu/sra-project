public void logout() {
    com.parse.ParseUser.getCurrentUser().logOut();
    android.content.Intent intent = new android.content.Intent(this, com.blueit.g1_chat.LoginActivity.class);
    startActivity(intent);
}