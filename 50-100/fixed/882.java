private void initToolbar() {
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbarMap)));
    setSupportActionBar(toolbar);
    android.support.v7.app.ActionBar supportActionBar = getSupportActionBar();
    if (supportActionBar != null) {
        supportActionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp);
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setTitle("");
    }
}