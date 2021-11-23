public java.lang.String getDeviceId() {
    return getString(R.string.pref_device_id, com.jana.android.core.utils.DeviceInfo.getUniqueId());
}