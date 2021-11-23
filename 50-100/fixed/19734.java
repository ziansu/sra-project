@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.navigation_progress :
            android.content.Intent iP = new android.content.Intent(this, janbiko.urgaining.ProgressActivity.class);
            startActivity(iP);
            break;
        case R.id.navigation_workout :
            break;
        case R.id.navigation_settings :
            android.content.Intent iS = new android.content.Intent(this, janbiko.urgaining.SettingsActivity.class);
            startActivity(iS);
            break;
    }
    return true;
}