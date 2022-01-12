private void setupActionBar(android.support.v7.widget.Toolbar toolbar) {
    this.setSupportActionBar(toolbar);
    android.support.v7.app.ActionBar actionBar = this.getSupportActionBar();
    if (actionBar != null) {
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        toolbar.setNavigationIcon(amai.org.conventions.ThemeAttributes.getDrawable(this, R.attr.toolbarLogo));
    }
}