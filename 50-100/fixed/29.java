@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.refresh_menu :
            android.util.Log.d("Refresh", "...");
            getMainFragment().load();
            break;
        case R.id.settings_menu :
            startActivity(new android.content.Intent(this, com.grp8.weatherapp.Activities.SettingsActivity.class));
            break;
        case R.id.logout_menu :
            break;
        default :
            break;
    }
    return true;
}