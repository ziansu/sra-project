@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_project_info);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    android.support.v7.widget.Toolbar mToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    if (mToolbar != null) {
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationIcon(R.drawable.ic_file);
        getSupportActionBar().setTitle(R.string.project_info);
    }
}