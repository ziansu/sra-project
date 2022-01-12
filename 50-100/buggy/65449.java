@com.google.appinventor.components.annotations.SimpleFunction
public java.lang.String FoundDeviceName(int index) {
    if (index <= (mLeDevices.size())) {
        LogMessage("Device Name is found", "i");
        return mLeDevices.get(index).getName();
    }else {
        LogMessage("Device Name isn't found", "e");
        return null;
    }
}