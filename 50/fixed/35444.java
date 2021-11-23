public void stopScan() {
    if ((scanner) != null)
        scanner.stopScan(populateDevices);
    
    if ((deviceList) != null)
        deviceList.clear();
    
}