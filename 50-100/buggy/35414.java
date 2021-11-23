private void restoreActionBar() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar == null)
        return ;
    
    actionBar.setDisplayShowTitleEnabled(true);
    java.lang.String title = mSubjectDb.getItem(de.oerntec.votenote.MainActivity.mCurrentSelectedSubjectId).name;
    actionBar.setTitle(title);
    invalidateOptionsMenu();
}