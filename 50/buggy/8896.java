@java.lang.Override
protected void onResume() {
    super.onResume();
    de.beacon.tom.viibenav_radiomapper.model.BluetoothScan.getBtScan(this).onResumeOperation();
    init();
    android.util.Log.d(de.beacon.tom.viibenav_radiomapper.controller.InfoActivity.TAG, "RESUMING IN INFO");
}