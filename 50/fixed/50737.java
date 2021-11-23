@java.lang.Override
protected void onPause() {
    super.onPause();
    java.lang.System.out.println("onPause");
    redBearService.stopScanDevice();
    redBearService = null;
    leListAdapter.clear();
}