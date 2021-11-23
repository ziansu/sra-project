@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> getDeviceInfo() {
    if ((deviceInfo) == null) {
        return new java.util.HashMap<java.lang.String, java.lang.String>() {
            {
                put(DeviceAttribute.Class, DeviceClass.Generic);
            }
        };
    }
    return deviceInfo;
}