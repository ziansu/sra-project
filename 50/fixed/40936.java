private int maxAdvertiseInstances() {
    com.android.bluetooth.btservice.AdapterService adapter;
    int numOfAdvtInstances = 0;
    if (null != (adapter = com.android.bluetooth.btservice.AdapterService.getAdapterService())) {
        numOfAdvtInstances = adapter.getNumOfAdvertisementInstancesSupported();
        return numOfAdvtInstances - 1;
    }
    return numOfAdvtInstances;
}