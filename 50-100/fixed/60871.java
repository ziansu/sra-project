public void initAppBar() {
    toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    if (null != (toolbar)) {
        setSupportActionBar(toolbar);
    }
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}