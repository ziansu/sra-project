@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.navigation_home :
            changeFragment(0);
            return true;
        case R.id.navigation_dashboard :
            changeFragment(1);
            return true;
        case R.id.navigation_notifications :
            changeFragment(2);
            return true;
    }
    return false;
}