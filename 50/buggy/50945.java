public void onBackPressed() {
    super.onBackPressed();
    android.util.Log.d("### ", "on back pressed setting activity ******************");
    (com.health.openscale.gui.SettingsActivity.backPressed)++;
    if ((com.health.openscale.gui.SettingsActivity.backPressed) == 1) {
        MainActivity.mSectionsPagerAdapter.notifyDataSetChanged();
        com.health.openscale.gui.SettingsActivity.backPressed = 0;
    }
}