@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.logout_toolbar_item :
            this.onLogoutPress(findViewById(R.id.logout_toolbar_item));
            break;
        default :
            break;
    }
    return (drawerToggle.onOptionsItemSelected(item)) || (super.onOptionsItemSelected(item));
}