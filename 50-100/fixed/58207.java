@java.lang.Override
@android.annotation.TargetApi(value = 21)
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (drawerToggle.onOptionsItemSelected(item)) {
        return true;
    }
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }else
        if (id == (R.id.menu_grid_layout)) {
            changeGridLayout(item);
        }else
            if (id == (R.id.menu_sorting)) {
                changeFavoritesSorting();
            }else
                if (id == (R.id.menu_keep_screen_on)) {
                    setKeepScreenOn(item);
                }
            
        
    
    return super.onOptionsItemSelected(item);
}