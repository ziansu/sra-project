public void launchSettingsActivity(android.view.MenuItem item) {
    startActivity(new android.content.Intent(this, com.dita.dev.memoapp.ui.activity.SettingsActivity.class));
    drawer.closeDrawer(GravityCompat.START);
}