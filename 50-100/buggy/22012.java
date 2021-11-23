public void discoverPeers() {
    android.util.Log.d(com.seniordesign.wolfpack.quizinator.activities.HostGameActivity.TAG, "discoverPeers");
    if (!(wifiDirectApp.isP2pEnabled())) {
        android.widget.Toast.makeText(this, R.string.p2p_off_warning, Toast.LENGTH_LONG).show();
        return ;
    }
    wifiDirectApp.mP2pMan.discoverPeers(wifiDirectApp.mP2pChannel, new android.net.wifi.p2p.WifiP2pManager.ActionListener() {
        @java.lang.Override
        public void onSuccess() {
            discoverPeersGroupInfoOnSuccess();
        }

        @java.lang.Override
        public void onFailure(int reasonCode) {
            if ((getPeerListFragment()) != null)
                getPeerListFragment().clearPeers();
            
        }
    });
}