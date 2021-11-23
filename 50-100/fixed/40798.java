@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.util.Log.d(ag.ndn.ndnoverwifidirect.MainActivity.TAG, "Init WifiP2P for this app");
    initWifiP2p();
    android.util.Log.d(ag.ndn.ndnoverwifidirect.MainActivity.TAG, "Start using NDNOverWifiDirect interface...");
    android.util.Log.d(ag.ndn.ndnoverwifidirect.MainActivity.TAG, "Discover peers");
    try {
        mController.initialize();
        mController.discoverPeers(mManager, mChannel);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}