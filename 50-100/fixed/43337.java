@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    try {
        beaconManager.stopRangingBeaconsInRegion(new org.altbeacon.beacon.Region("Ranging region", null, null, null));
    } catch (android.os.RemoteException re) {
        re.printStackTrace();
    }
    beaconManager.unbind(this);
}