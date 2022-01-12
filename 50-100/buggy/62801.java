@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    switch (menuItem.getItemId()) {
        case R.id.create_note_item :
            toCreateMindFragment();
            menuItem.setChecked(true);
            break;
        case R.id.list_item :
            toListViewFragment();
            menuItem.setChecked(true);
            break;
        case R.id.view_item :
            menuItem.setChecked(true);
            toViewMindFragment();
            break;
        case R.id.main_item :
            menuItem.setChecked(true);
            toMainFragment();
            break;
    }
    drawerLayout.closeDrawers();
    return true;
}