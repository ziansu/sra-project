public void setupToolBar() {
    if ((toolbar) != null) {
        toolbar.setTitle(getResources().getString(R.string.app_name));
        toolbar.setTitleTextColor(getResources().getColor(R.color.toolbar_text_color));
        setSupportActionBar(toolbar);
    }
}