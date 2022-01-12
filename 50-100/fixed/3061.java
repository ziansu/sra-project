public void updatePeerList(android.net.wifi.p2p.WifiP2pDeviceList peerList) {
    peers.clear();
    if (peerList != null) {
        peers.addAll(peerList.getDeviceList());
    }
    peerListAdapter.clear();
    peerListAdapter.addAll(peers);
    peerListAdapter.notifyDataSetChanged();
}