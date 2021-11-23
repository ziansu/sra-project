@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (drawerToggle.onOptionsItemSelected(item)) {
        return true;
    }
    int id = item.getItemId();
    switch (id) {
        case R.id.action_search :
            android.util.Log.d(TAG, " Onclick searchview");
            break;
        case R.id.action_sort :
            showSortPopup(findViewById(R.id.action_sort));
            break;
        default :
            break;
    }
    return super.onOptionsItemSelected(item);
}