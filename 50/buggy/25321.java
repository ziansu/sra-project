private void showGlobalContextActionBar() {
    android.app.ActionBar actionBar = getActivity().getActionBar();
    actionBar.setDisplayShowTitleEnabled(true);
    actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
}