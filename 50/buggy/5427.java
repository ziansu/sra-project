@java.lang.Override
public void run() {
    if ((redBearService) != null) {
        redBearService.stopScanDevice();
        isScanning = false;
        leListAdapter.notifyDataSetChanged();
    }
}