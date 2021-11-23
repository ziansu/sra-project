private void setUiEnabled(boolean enabled) {
    com.android1.homework3.ui.MainActivity mainActivity = mMainActivityWeakRef.get();
    if (mainActivity == null) {
        return ;
    }
    android.app.FragmentManager fragmentManager = mainActivity.getFragmentManager();
    android.app.Fragment fragment;
    for (java.lang.String tag : com.android1.homework3.ui.Controller.sUiFragmentTags) {
        fragment = fragmentManager.findFragmentByTag(tag);
        if ((fragment instanceof com.android1.homework3.ui.UiFragment) && (fragment.isAdded())) {
            ((com.android1.homework3.ui.UiFragment) (fragment)).setUiEnabled(true);
        }
    }
}