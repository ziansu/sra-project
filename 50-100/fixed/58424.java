public int getProfileConnectionState(com.android.settingslib.bluetooth.LocalBluetoothProfile profile) {
    if ((mProfileConnectionState.isEmpty()) || ((mProfileConnectionState.get(profile)) == null)) {
        int state = profile.getConnectionStatus(mDevice);
        mProfileConnectionState.put(profile, state);
    }
    return mProfileConnectionState.get(profile);
}