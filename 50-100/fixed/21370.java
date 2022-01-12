@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.menu_refresh :
            refreshData(true);
            break;
        case R.id.menu_invite :
            onInviteClicked();
            break;
    }
    return super.onOptionsItemSelected(item);
}