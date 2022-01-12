@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (item.getItemId()) {
        case R.id.action_search :
            openSearch();
            return true;
        case R.id.action_create_album :
            openCreateAlbum();
            return true;
        case R.id.action_invite :
            openInvite();
            return true;
        case R.id.action_share :
            openShare();
            return true;
        case R.id.action_album_refresh :
            refreshList();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}