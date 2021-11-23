@java.lang.Override
public void onSuccess() {
    mManager.addServiceRequest(mChannel, serviceRequest, new android.net.wifi.p2p.WifiP2pManager.ActionListener() {
        @java.lang.Override
        public void onSuccess() {
            mManager.discoverServices(mChannel, new android.net.wifi.p2p.WifiP2pManager.ActionListener() {
                @java.lang.Override
                public void onSuccess() {
                    java.lang.System.out.println("ServiceDiscovery Started");
                }

                @java.lang.Override
                public void onFailure(int error) {
                    java.lang.System.out.println("ServiceDiscovery Failed");
                }
            });
        }

        @java.lang.Override
        public void onFailure(int error) {
        }
    });
}