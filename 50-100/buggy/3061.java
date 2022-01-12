public void updatePeerList(android.net.wifi.p2p.WifiP2pDeviceList peerList) {
    peers.clear();
    if (peerList != null) {
        android.util.Log.d(com.group.cs.wi_free.DeviceListFragment.TAG, "updatePeerList valid");
        peers.addAll(peerList.getDeviceList());
    }
    peerListAdapter.clear();
    peerListAdapter.addAll(peers);
    peerListAdapter.notifyDataSetChanged();
}