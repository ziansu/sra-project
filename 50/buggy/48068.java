@java.lang.Override
public java.lang.String getItem(int i) {
    if ((mSortedDevices) == null) {
        mSortedDevices = new java.util.ArrayList<>(mUrlToDeviceAddress.values());
        java.util.Collections.sort(mSortedDevices, mComparator);
    }
    return mSortedDevices.get(i);
}