@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.login_main_activity);
    android.content.SharedPreferences settings = getSharedPreferences(com.CMPUT301W15T02.teamtoapp.Activities.LoginActivity.PREFS_NAME, 0);
    boolean hasLoggedIn = settings.getBoolean("hasLoggedIn", false);
    if (hasLoggedIn) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.CMPUT301W15T02.teamtoapp.Activities.ClaimantClaimsListActivity.class);
        startActivity(intent);
        this.finish();
    }
}