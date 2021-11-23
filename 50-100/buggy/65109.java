@java.lang.Override
public void onListItemClick(android.widget.ListView listView, android.view.View view, int position, long id) {
    super.onListItemClick(listView, view, position, id);
    if ((callbacks) != null) {
        callbacks.onItemSelected(worker.userProfile.chats.get(position).peerName);
    }
}