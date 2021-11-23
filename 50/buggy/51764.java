@com.google.appinventor.components.annotations.SimpleFunction
public int FoundDeviceRssi(int index) {
    if (index <= (mLeDevices.size()))
        return mLeDeviceRssi.get(mLeDevices.get(index));
    else
        return -1;
    
}