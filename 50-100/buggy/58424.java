public int getProfileConnectionState(com.android.settingslib.bluetooth.LocalBluetoothProfile profile) {
    if (((mProfileConnectionState) == null) || ((mProfileConnectionState.get(profile)) == null)) {
        int state = profile.getConnectionStatus(mDevice);
        mProfileConnectionState.put(profile, state);
    }
    return mProfileConnectionState.get(profile);
}