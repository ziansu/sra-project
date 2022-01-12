@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.nav_search :
            mDrawerLayout.closeDrawers();
            return true;
        case R.id.nav_saved_search_results :
            mDrawerLayout.closeDrawers();
            android.content.Intent savedResultsIntent = new android.content.Intent(this, com.example.android.vigi.SavedSearchResultsActivity.class);
            startActivity(savedResultsIntent);
            return true;
        case R.id.nav_settings :
            mDrawerLayout.closeDrawers();
            android.content.Intent settingsIntent = new android.content.Intent(this, com.example.android.vigi.SettingsActivity.class);
            startActivity(settingsIntent);
            return true;
        default :
            return false;
    }
}