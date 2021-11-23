@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_about);
    mToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    versionText = ((android.widget.TextView) (findViewById(R.id.version_text)));
    setSupportActionBar(mToolbar);
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    versionText.setText(getVersion());
}