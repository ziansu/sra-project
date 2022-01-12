@java.lang.Override
public int getItemCount() {
    if ((mDeviceList) == null) {
        return 0;
    }else {
        synchronized(mDeviceList) {
            return (mDeviceList) == null ? 0 : mDeviceList.size();
        }
    }
}