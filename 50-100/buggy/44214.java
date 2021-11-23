private void processScanResult(android.bluetooth.le.ScanResult result) {
    if (((result.getDevice().getName()) == null) || (!(result.getDevice().getName().startsWith("SLBeacon")))) {
        return ;
    }
    java.lang.String macAddress = result.getDevice().getAddress();
    resultsReporter.reportBleScan(result.getRssi(), macAddress);
}