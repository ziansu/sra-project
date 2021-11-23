public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    java.lang.String buddyname = ((android.widget.TextView) (v.findViewById(R.id.BuddyName))).getText().toString();
    java.lang.String macAddr = ((android.widget.TextView) (v.findViewById(R.id.MacAddress))).getText().toString();
    registerForContextMenu(buddylistView);
    buddylistView.showContextMenuForChild(v);
    unregisterForContextMenu(buddylistView);
}