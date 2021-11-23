@butterknife.OnClick(value = R.id.test_fab)
public void onFabClick(android.view.View v) {
    if (mBleWrapper.isConnected()) {
        mBleWrapper.stopScanning();
        mDevicesListAdapter.clearList();
        if (null != (App.timerTask)) {
            com.smartbracelet.com.smartbracelet.util.LogUtil.d("stop_post_package");
            App.timerTask.cancel();
        }
    }
    mScanning = true;
    addScanningTimeout();
    mBleWrapper.startScanning();
    if (null != (locationService)) {
        locationService.start();
    }
    mTextView.setText("Utt smart bracelet begin ...");
}