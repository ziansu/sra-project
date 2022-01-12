@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (((savedInstanceState != null) && (!(nccp.app.parse.ParseManager.isDatabaseSet()))) || ((com.parse.ParseUser.getCurrentUser()) == null)) {
        android.content.Intent intent = new android.content.Intent(this, nccp.app.ui.LoginActivity.class);
        startActivity(intent);
        finish();
    }
}