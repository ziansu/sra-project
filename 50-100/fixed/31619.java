@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if (!(navigationDrawerFragment.isDrawerOpen())) {
        getMenuInflater().inflate(R.menu.main, menu);
        if ((getSupportActionBar()) != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            mToolbarTitle.setText(title);
        }
        return true;
    }
    return super.onCreateOptionsMenu(menu);
}