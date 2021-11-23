private int getNetworkTypeForJob() {
    int networkTypeSelectedPos = networkTypeSpinner.getSelectedItemPosition();
    int networkType = Job.NetworkType.NETWORK_TYPE_ANY;
    switch (networkTypeSelectedPos) {
        case 1 :
            networkType = Job.NetworkType.NETWORK_TYPE_CONNECTED;
            break;
        case 2 :
            networkType = Job.NetworkType.NETWORK_TYPE_UNMETERED;
            break;
    }
    return networkType;
}