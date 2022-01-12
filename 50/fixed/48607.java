private void startScan() {
    btScan.setText(getString(R.string.stop));
    resultContainer.removeAllViewsInLayout();
    showStartNotification();
    presenter.startScan();
}