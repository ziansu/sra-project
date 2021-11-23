@com.google.appinventor.components.annotations.SimpleFunction(description = "Get the name of found device by index. Index specifies the position of DeviceList.")
public java.lang.String FoundDeviceName(int index) {
    if (index <= (mLeDevices.size())) {
        LogMessage("Device Name is found", "i");
        return mLeDevices.get((index - 1)).getName();
    }else {
        LogMessage("Device Name isn't found", "e");
        return null;
    }
}