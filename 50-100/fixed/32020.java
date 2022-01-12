private void initToolbar() {
    toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    toolbar.setTitle(R.string.app_name);
    setSupportActionBar(toolbar);
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
    }
    toolbar.setOnMenuItemClickListener(new android.support.v7.widget.Toolbar.OnMenuItemClickListener() {
        @java.lang.Override
        public boolean onMenuItemClick(android.view.MenuItem item) {
            return false;
        }
    });
}