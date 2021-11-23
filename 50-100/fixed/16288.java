private void setCustomActionBar() {
    mToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.custom_toolbar)));
    mToolbar.setClickable(true);
    setSupportActionBar(mToolbar);
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        actionBar.setDisplayShowCustomEnabled(true);
    }
}