@java.lang.Override
protected void onPreExecute() {
    setLocationStatus(org.wordpress.android.ui.posts.EditPostSettingsFragment.LocationStatus.SEARCHING);
    showLocationView();
}