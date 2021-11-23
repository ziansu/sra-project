@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    android.support.design.widget.Snackbar.make(activityContent, item.getTitle(), Snackbar.LENGTH_LONG).show();
    activityContainer.closeDrawer(GravityCompat.START);
    return onOptionsItemSelected(item);
}