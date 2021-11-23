public boolean supportUplodData() {
    if ((((((mConnectBleInfo) != null) && (isGSPAvailable())) && (isNetworkAvailable())) && (isBletoothAvailable())) && ((mBleConnectionState) == (com.zhuozhi.monitor.MonitorService.STATE_CONNECTED))) {
        return true;
    }
    android.util.Log.i(Util.TAG, ("Not support upload::Prepare State ==" + (mPrepareState)));
    return false;
}