private void setCustomActionBar() {
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.custom_toolbar)));
    toolbar.setClickable(true);
    this.mToolbar = toolbar;
    setSupportActionBar(toolbar);
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        actionBar.setDisplayShowCustomEnabled(true);
    }
}