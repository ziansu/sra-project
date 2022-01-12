@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    getDelegate().installViewFactory();
    getDelegate().onCreate(savedInstanceState);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
    setSupportActionBar(((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar))));
    getSupportActionBar().setDisplayOptions((((android.support.v7.app.ActionBar.DISPLAY_SHOW_HOME) | (android.support.v7.app.ActionBar.DISPLAY_HOME_AS_UP)) | (android.support.v7.app.ActionBar.DISPLAY_SHOW_TITLE)));
}