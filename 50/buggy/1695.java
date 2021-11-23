@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.action_close)) {
        dismiss();
        return true;
    }else
        return false;
    
}