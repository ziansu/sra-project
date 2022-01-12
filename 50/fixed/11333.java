private void startRun() throws java.lang.Exception {
    try {
        configure();
    } catch (java.lang.Exception e) {
        android.util.Log.e(org.getlantern.lantern.service.LanternVpn.TAG, ("Error with VPN" + e));
    }
}