@java.lang.Override
public void onClientConnectionRequest(com.door43.translationstudio.network.Peer peer) {
    android.os.Handler hand = new android.os.Handler(android.os.Looper.getMainLooper());
    hand.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            updatePeerList(mExportService.getPeers());
        }
    });
}