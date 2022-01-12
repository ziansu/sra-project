public void photoDone(android.view.View v) {
    com.tindero.tindero.UserDbAdapter dbHelper = new com.tindero.tindero.UserDbAdapter(this);
    dbHelper.open();
    android.content.Intent intent = getIntent();
    java.lang.String id = intent.getStringExtra(UserDbAdapter.KEY_ROWID);
    java.lang.String user = intent.getStringExtra(UserDbAdapter.KEY_USERNAME);
    dbHelper.updatePhoto(outputFile.getAbsolutePath(), id);
    intent = new android.content.Intent(this, com.tindero.tindero.prof.class);
    intent.putExtra(UserDbAdapter.KEY_USERNAME, user);
    startActivity(intent);
}