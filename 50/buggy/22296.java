public void onDrawerClosed(android.view.View view) {
    getSupportActionBar().setTitle(buildStyledString(mTitle));
    supportInvalidateOptionsMenu();
}