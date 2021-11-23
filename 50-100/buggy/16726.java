private void initialize() {
    android.app.ActionBar actionBar = getActionBar();
    if (actionBar != null) {
        actionBar.setTitle("Корзина");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    context = this;
    helper = new database.DatabaseOpenHelper(this);
    mDB = helper.getWritableDatabase();
}