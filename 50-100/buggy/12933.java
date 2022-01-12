public void run() {
    if (!(discoveryReplyList.contains(packetData))) {
        discoveryReplyList.add(packetData);
        android.widget.ListView lvDiscoveryReplies = ((android.widget.ListView) (findViewById(R.id.listView_DiscoveryReplies)));
        android.widget.ArrayAdapter<java.lang.String> adapter = ((android.widget.ArrayAdapter<java.lang.String>) (lvDiscoveryReplies.getAdapter()));
        adapter.add(packetData);
        adapter.notifyDataSetChanged();
    }
}