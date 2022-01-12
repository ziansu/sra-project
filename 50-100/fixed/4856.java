@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (drawerToggle.onOptionsItemSelected(item)) {
        return true;
    }else
        if ((item.getItemId()) == (R.id.action_add_flag)) {
            switchToShareFragment();
        }
    
    return super.onOptionsItemSelected(item);
}