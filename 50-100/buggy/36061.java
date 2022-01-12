public void updateHeaderPadding(boolean show) {
    android.support.v7.app.ActionBar ab = getSupportActionBar();
    if (show) {
        header.setPadding(0, ((int) (getResources().getDimension(R.dimen.toolbar_height))), 0, 0);
    }else {
        header.setPadding(0, 0, 0, 0);
    }
}