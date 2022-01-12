@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.navigation_home :
            return true;
        case R.id.navigation_dashboard :
            return true;
    }
    return false;
}