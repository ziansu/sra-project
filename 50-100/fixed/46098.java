private clearcl.ClearCLDevice getDeviceWithName(java.util.ArrayList<clearcl.ClearCLDevice> pDevices, java.lang.String pDeviceName) {
    for (clearcl.ClearCLDevice lDevice : pDevices) {
        if (lDevice.getName().trim().toLowerCase().equals(pDeviceName.toLowerCase()))
            return lDevice;
        
    }
    return null;
}