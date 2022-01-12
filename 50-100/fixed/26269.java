private void setState() {
    boolean cntd = mApp.isCommConnected();
    if ((mDevice) != null) {
        mTvAddress.setTextColor(-1);
        mTvAddress.setText(java.lang.String.format(getResources().getString(R.string.using), mDevice.toString()));
    }else {
        mTvAddress.setTextColor(-65536);
        mTvAddress.setText(R.string.no_device_address);
    }
    updateList();
}