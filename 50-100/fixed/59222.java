private void initToolbar() {
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null)
        actionBar.setDisplayHomeAsUpEnabled(true);
    
    setTitleIfNeeded();
}