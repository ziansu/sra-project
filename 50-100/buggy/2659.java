private void setToolbar() {
    toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    getWindow().setStatusBarColor(android.support.v4.content.ContextCompat.getColor(getBaseContext(), R.color.red));
    actionBar.setDisplayHomeAsUpEnabled(true);
}