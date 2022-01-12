@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            showLogoutDialog();
            return true;
        case R.id.action_logout :
            showLogoutDialog();
            return true;
        default :
            return false;
    }
}