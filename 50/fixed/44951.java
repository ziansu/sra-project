private void setUpToolbar() {
    setSupportActionBar(((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar))));
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.setDisplayHomeAsUpEnabled(false);
    actionBar.setTitle("Contacts");
}