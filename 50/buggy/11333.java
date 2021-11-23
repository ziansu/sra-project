private void startRun() throws java.lang.Exception {
    try {
        configure();
        android.util.Log.i(org.getlantern.lantern.service.LanternVpn.TAG, "Started VPN mode");
    } catch (java.lang.Exception e) {
        android.util.Log.e(org.getlantern.lantern.service.LanternVpn.TAG, ("Error with VPN" + e));
    }
}