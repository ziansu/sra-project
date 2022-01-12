@java.lang.Override
public void deviceDisconnected(android.bluetooth.BluetoothDevice device) {
    java.lang.Integer deviceId = com.nod_labs.unityplugin.UnityOpenSpatialPluginActivity.mDeviceIdMap.inverse().get(device);
    if (deviceId != null) {
        com.nod_labs.unityplugin.UnityOpenSpatialPluginActivity.mRotationMap.remove(deviceId);
        com.nod_labs.unityplugin.UnityOpenSpatialPluginActivity.mPointerMap.remove(deviceId);
        com.nod_labs.unityplugin.UnityOpenSpatialPluginActivity.mButtonMap.remove(deviceId);
        com.nod_labs.unityplugin.UnityOpenSpatialPluginActivity.mGestureMap.remove(deviceId);
    }
}