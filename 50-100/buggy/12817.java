@java.lang.Override
public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
    super.onCreateContextMenu(menu, v, menuInfo);
    menu.clear();
    menu.add(0, com.phicdy.mycuration.ui.FilterListFragment.EDIT_FILTER_MENU_ID, 0, R.string.edit_filter);
    menu.add(0, com.phicdy.mycuration.ui.FilterListFragment.DELETE_FILTER_MENU_ID, 1, R.string.delete_filter);
}