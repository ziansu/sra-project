private void initToolbar() {
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    mTitle = ((android.widget.TextView) (findViewById(R.id.title)));
    if (hideToolbar()) {
        toolbar.setVisibility(View.GONE);
    }
}