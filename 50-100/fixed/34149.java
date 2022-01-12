public void newMessageButton(android.view.View view) {
    final java.lang.String CONTENT = "SELECT_FRIEND";
    android.content.Intent intent = new android.content.Intent(this, cs460.grouple.grouple.UserListActivity.class);
    intent.putExtra("email", user.getEmail());
    intent.putExtra("content", CONTENT);
    startActivity(intent);
}