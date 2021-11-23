@java.lang.Override
public void deviceDisconnected(android.bluetooth.BluetoothDevice device) {
    java.lang.Integer deviceId = com.nod_labs.unityplugin.UnityOpenSpatialPluginActivity.mDeviceIdMap.inverse().get(device);
    if (deviceId != null) {
        com.nod_labs.unityplugin.UnityOpenSpatialPluginActivity.mRotationMap.put(deviceId, new float[]{ 0.0F , 0.0F , 0.0F });
        com.nod_labs.unityplugin.UnityOpenSpatialPluginActivity.mPointerMap.put(deviceId, new int[]{ 0 , 0 });
        com.nod_labs.unityplugin.UnityOpenSpatialPluginActivity.mButtonMap.put(deviceId, 0);
        com.nod_labs.unityplugin.UnityOpenSpatialPluginActivity.mGestureMap.put(deviceId, 0);
    }
}