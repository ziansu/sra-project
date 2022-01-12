@java.lang.Override
public void run() {
    mDeviceInfo = new com.lge.qdv.util.DeviceInfo(mHandler);
    com.lge.qdv.util.DeviceInfoDiff diff = mDeviceInfo.getDiff(mPrevDeviceInfo);
    android.util.Log.d(IQDV.TAG, mDeviceInfo.toString(mPrevDeviceInfo));
    saveInfo(diff);
    mHandler.sendEmptyMessage(IQDV.MSG_UPDATE_DEVICE_INFO);
    mHandler.sendEmptyMessage(IQDV.MSG_CLOSE_DIALOG);
}