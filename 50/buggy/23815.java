@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_screen);
    com.parse.Parse.initialize(this, "4Zq7ugmsgzwIWgyczr6oEQpd3mdTerqwI0j9OrbX", "ZPf6nqSWHXVdxZnPyAkyaUapse3C2iLtdXtQWpwS");
    com.parse.ParseInstallation.getCurrentInstallation().saveInBackground();
}