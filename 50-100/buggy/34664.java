@java.lang.Override
public void onScanResult(int callbackType, final android.bluetooth.le.ScanResult result) {
    super.onScanResult(callbackType, result);
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mLeDeviceListAdapter.addDevice(result.getDevice());
            mLeDeviceListAdapter.notifyDataSetChanged();
            scan_progress.clearAnimation();
        }
    });
}