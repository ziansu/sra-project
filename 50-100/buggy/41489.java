@java.lang.Override
public void onBeaconsDiscovered(com.estimote.sdk.Region region, final java.util.List<com.estimote.sdk.Beacon> beacons) {
    devList.replaceWith(beacons);
    nearest = devList.getClosest();
    double distance = com.estimote.sdk.Utils.computeAccuracy(nearest);
    com.estimote.sdk.Utils.Proximity prox = com.estimote.sdk.Utils.proximityFromAccuracy(distance);
    if ((Utils.Proximity.NEAR) == prox) {
        if (null != (savedActivity)) {
            ((com.shoply.shop.shoply.SearchFragment.ReceiveBeaconListener) (savedActivity)).onBeaconsDiscovered(nearest);
        }
    }
}