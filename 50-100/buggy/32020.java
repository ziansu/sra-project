private void initToolbar() {
    toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    toolbar.setTitle(R.string.app_name);
    toolbar.setSubtitle(R.string.training_programs);
    setSupportActionBar(toolbar);
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    toolbar.setOnMenuItemClickListener(new android.support.v7.widget.Toolbar.OnMenuItemClickListener() {
        @java.lang.Override
        public boolean onMenuItemClick(android.view.MenuItem item) {
            return false;
        }
    });
}