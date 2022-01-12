private void setupToolbar() {
    setSupportActionBar(mToolbar);
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        com.softdesign.school.utils.Lg.i(TAG, "action bar creation");
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_24dp);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    android.support.v4.view.ViewCompat.setTransitionName(findViewById(R.id.app_bar_layout), com.softdesign.school.ui.activities.MainActivity.EXTRA_IMAGE);
    mCollapsingToolbarLayout = ((android.support.design.widget.CollapsingToolbarLayout) (findViewById(R.id.collapsing_toolbar)));
}