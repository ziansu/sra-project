public void setUpActionBar(android.support.v7.app.ActionBar actionBar) {
    if (actionBar == null) {
        return ;
    }
    actionBar.setDisplayHomeAsUpEnabled(true);
    actionBar.setHomeButtonEnabled(true);
}