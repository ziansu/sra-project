void initToolbar() {
    android.support.v7.app.ActionBar ab = getSupportActionBar();
    if (ab != null) {
        ab.setDisplayShowHomeEnabled(true);
        ab.setDisplayShowTitleEnabled(false);
        ab.setLogo(R.drawable.gwlogo);
    }
}