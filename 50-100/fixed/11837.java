private void onRightDrawerOpened() {
    java.lang.String properties = getResources().getString(R.string.properties);
    java.lang.String tool = getResources().getString(getTool().getName());
    actionBar.setTitle(((properties + ": ") + tool));
}