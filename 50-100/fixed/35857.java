@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    mActivityTitle = savedInstanceState.getCharSequence(ACTIVITY_TITLE);
    getSupportActionBar().setTitle(mActivityTitle);
    java.lang.CharSequence activitySubtitle = savedInstanceState.getCharSequence(ACTIVITY_SUB_TITLE);
    getSupportActionBar().setSubtitle(activitySubtitle);
    if ((getSupportFragmentManager().getBackStackEntryCount()) == 0) {
        mArtistsFragment.showArtistsDetails();
    }
}