protected void setupToolbar(int toolBarId, java.lang.String title, boolean showIcon, boolean showUp) {
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(toolBarId)));
    if (!(org.apache.commons.lang.StringUtils.isEmpty(title))) {
        toolbar.setTitle(android.text.Html.fromHtml(title));
    }
    setSupportActionBar(toolbar);
    if (showUp) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    if (showIcon) {
        getSupportActionBar().setIcon(R.drawable.action_icon);
    }
}