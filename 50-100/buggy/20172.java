com.android.bluetooth.gatt.ScanClient getAggressiveClient(java.util.Set<com.android.bluetooth.gatt.ScanClient> cList, boolean isBatchClientList, int resultType) {
    com.android.bluetooth.gatt.ScanClient result = null;
    int curScanSetting = java.lang.Integer.MIN_VALUE;
    for (com.android.bluetooth.gatt.ScanClient client : cList) {
        if ((!isBatchClientList) || (isBatchClientList && (resultType == (getResultType(client.settings))))) {
            if ((client.settings.getScanMode()) > curScanSetting) {
                result = client;
            }
        }
    }
    return result;
}