public boolean isBleMultipleAdvertisementSupported() {
    boolean isSupported = false;
    if ((mDiscoveryManager) != null) {
        isSupported = mDiscoveryManager.isBleMultipleAdvertisementSupported();
    }else {
        org.thaliproject.p2p.btconnectorlib.DiscoveryManager discoveryManager = new org.thaliproject.p2p.btconnectorlib.DiscoveryManager(mContext, this, io.jxcore.node.ConnectionHelper.BLE_SERVICE_UUID, io.jxcore.node.ConnectionHelper.SERVICE_TYPE);
        isSupported = discoveryManager.isBleMultipleAdvertisementSupported();
    }
    return isSupported;
}