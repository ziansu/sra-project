private void showGlobalContextActionBar() {
    android.app.ActionBar actionBar = getActivity().getActionBar();
    if (actionBar != null) {
        actionBar.setDisplayShowTitleEnabled(true);
    }
}