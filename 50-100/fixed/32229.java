@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            mDrawer.openDrawer(GravityCompat.START);
            return true;
    }
    return (drawerToggle.onOptionsItemSelected(item)) || (super.onOptionsItemSelected(item));
}