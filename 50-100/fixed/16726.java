private void initialize() {
    context = this;
    android.app.ActionBar actionBar = getActionBar();
    if (actionBar != null) {
        actionBar.setTitle("Корзина");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    helper = new database.DatabaseOpenHelper(this);
    mDB = helper.getWritableDatabase();
}