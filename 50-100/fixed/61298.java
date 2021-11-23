private void processResult(android.bluetooth.le.ScanResult result) {
    de.beacon.tom.viibenav_radiomapper.model.OnyxBeacon beacon = de.beacon.tom.viibenav_radiomapper.controller.Advertisement.extractAD(result.getDevice().getAddress(), result.getRssi(), result.getScanRecord().getBytes());
    if (beacon != null)
        beacon.checkState();
    
}