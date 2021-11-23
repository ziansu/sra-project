public void init() {
    mSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    android.widget.Button exitButton = ((android.widget.Button) (findViewById(R.id.exitButton)));
    exitButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            finish();
            java.lang.System.exit(0);
        }
    });
    com.example.xavier.viaproject.DatabaseAccess databaseAccess = new com.example.xavier.viaproject.DatabaseAccess(this);
    databaseAccess.launchCount();
}