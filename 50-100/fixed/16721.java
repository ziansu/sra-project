@butterknife.OnClick(value = R.id.test_fab)
public void onFabClick(android.view.View v) {
    if ((null != (mBleWrapper)) && (mBleWrapper.isConnected())) {
        return ;
    }
    mScanning = true;
    addScanningTimeout();
    mBleWrapper.startScanning();
    if (null != (locationService)) {
        locationService.start();
    }
    mTextView.setText("Utt smart bracelet begin ...");
}