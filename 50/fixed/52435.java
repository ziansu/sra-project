private int getNetworkTypeForJob() {
    int networkTypeSelectedPos = networkTypeSpinner.getSelectedItemPosition();
    switch (networkTypeSelectedPos) {
        default :
        case 0 :
            return Job.NetworkType.NETWORK_TYPE_ANY;
        case 1 :
            return Job.NetworkType.NETWORK_TYPE_CONNECTED;
        case 2 :
            return Job.NetworkType.NETWORK_TYPE_UNMETERED;
    }
}