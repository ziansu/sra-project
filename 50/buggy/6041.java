private void startReadRequest() {
    android.util.Log.i(net.fishandwhistle.openpos.BarcodeReaderActivity.TAG, ("Launching read request " + (currentReadRequest)));
    currentReadRequest = java.lang.System.currentTimeMillis();
    enableScanning = true;
}