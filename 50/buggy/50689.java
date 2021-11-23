public void restoreActionBar() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        actionBar.setDisplayShowTitleEnabled(true);
        setTitle(mTitle);
    }
}