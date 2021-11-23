@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.fragment_browse_peer_menu_filter :
            return true;
        case R.id.fragment_browse_peer_menu_checkbox :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}