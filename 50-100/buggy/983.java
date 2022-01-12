@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_about);
    mAboutToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar_about)));
    mAboutToolbar.setTitle("Smart Sms Helper");
    setSupportActionBar(mAboutToolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setDisplayShowHomeEnabled(true);
}