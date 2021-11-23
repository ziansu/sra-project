@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    hideInfoText();
    selectDrawerItem(item);
    return false;
}