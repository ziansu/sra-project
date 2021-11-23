@java.lang.Override
public boolean onContextItemSelected(android.view.MenuItem item) {
    android.widget.AdapterView.AdapterContextMenuInfo info = ((android.widget.AdapterView.AdapterContextMenuInfo) (item.getMenuInfo()));
    int position = info.position;
    switch (item.getItemId()) {
        case R.id.menu_item_delete_message :
            com.gotye.api.GotyeChatTarget target = mAdapter.getItem(position);
            api.deleteSession(target);
            updateList();
            return true;
        default :
            break;
    }
    return super.onContextItemSelected(item);
}