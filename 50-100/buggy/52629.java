public void setupToolBar() {
    if ((toolbar) != null) {
        toolbar.setTitle(getResources().getString(R.string.app_name));
        toolbar.setTitleTextColor(getResources().getColor(R.color.toolbar_text_color));
        if (!(tabletSize)) {
            toolbar.setNavigationIcon(new com.mikepenz.iconics.IconicsDrawable(this).icon(FontAwesome.Icon.faw_bars).color(getResources().getColor(R.color.white_main)).sizeDp(16));
        }
        setSupportActionBar(toolbar);
    }
}