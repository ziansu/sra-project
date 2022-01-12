public synchronized boolean startScannerAndAdvertiser() {
    android.util.Log.d(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoverer.TAG, ("startScannerAndAdvertiser : " + (org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BleAdvertiser.currentThreadToString())));
    boolean adv = startAdvertiser();
    android.util.Log.d(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoverer.TAG, ("startScannerAndAdvertiser: advertiser is started. " + (org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BleAdvertiser.currentThreadToString())));
    boolean disc = startScanner();
    android.util.Log.i(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoverer.TAG, ((("startScannerAndAdvertiser: adv = " + adv) + ", disc = ") + disc));
    return adv && disc;
}