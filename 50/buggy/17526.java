@java.lang.Override
public boolean onMenuItemActionCollapse(android.view.MenuItem item) {
    android.util.Log.d("Reached", "Menu Collapse menu");
    dayAdapter.setFilter(talks);
    return true;
}