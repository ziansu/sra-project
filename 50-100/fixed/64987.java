public void showMainElements() {
    findViewById(R.id.loading_logo_image_view).setVisibility(View.GONE);
    getSupportActionBar().show();
    findViewById(R.id.main_recycler_view_holder).setVisibility(View.VISIBLE);
    ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))).setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
}