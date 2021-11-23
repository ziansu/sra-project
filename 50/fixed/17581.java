@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (com.comp.ninti.general.NavigationUtil.switchNavigation(item, this))
        return true;
    
    return super.onOptionsItemSelected(item);
}