private void hideMainElements() {
    findViewById(R.id.loading_logo_image_view).setVisibility(View.VISIBLE);
    getSupportActionBar().hide();
    findViewById(R.id.main_recycler_view_holder).setVisibility(View.GONE);
    findViewById(R.id.message_edit_text).setVisibility(View.GONE);
    findViewById(R.id.message_send_button).setVisibility(View.GONE);
    ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))).setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
}