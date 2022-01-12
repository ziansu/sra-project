@java.lang.Override
public void onSuccess() {
    mManager.discoverServices(mChannel, new android.net.wifi.p2p.WifiP2pManager.ActionListener() {
        @java.lang.Override
        public void onSuccess() {
        }

        @java.lang.Override
        public void onFailure(int error) {
        }
    });
}