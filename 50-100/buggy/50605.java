private void addActionBar() {
    toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    setSupportActionBar(toolbar);
    if (actionBar != null) {
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
    }
}