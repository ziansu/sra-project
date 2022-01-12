@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    mMenu = menu;
    getMenuInflater().inflate(R.menu.lask_list_menu, menu);
    mRefreshStatisticsItem = mMenu.findItem(R.id.menu_refresh);
    int sortingId = mSharedPrefsDeserializer.getListSorting();
    switch (sortingId) {
        case R.id.menu_sort_az :
        case R.id.menu_sort_za :
        case R.id.menu_sort_new_old :
        case R.id.menu_sort_old_new :
            menu.findItem(sortingId).setChecked(true);
            return true;
    }
    initTaskListTab();
    return true;
}