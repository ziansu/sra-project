@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }else
        if (id == (R.id.action_search)) {
            handleMenuSearch();
        }else
            if (id == (R.id.action_refresh_list)) {
                checkForNewContent(true);
            }
        
    
    return super.onOptionsItemSelected(item);
}