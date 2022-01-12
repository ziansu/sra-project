public void onDrawerClosed(android.view.View view) {
    super.onDrawerClosed(view);
    if (ut.getEmailAddress().equals("none")) {
        getSupportActionBar().setTitle("Your Position");
    }else {
        getSupportActionBar().setTitle(mActivityTitle);
    }
    invalidateOptionsMenu();
}