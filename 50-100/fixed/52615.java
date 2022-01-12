public void onDiscover(final android.bluetooth.BluetoothDevice device) {
    if ((!(mDiscoveredDevices.contains(device))) && (null != (device.getName()))) {
        mDiscoveredDevices.add(device);
        mListViewAdapter.notifyDataSetChanged();
        android.util.Log.i(com.beatboxers.dialogs.ScanDialog.LOG_TAG, ("discovered device: " + (device.getName().trim())));
    }
}