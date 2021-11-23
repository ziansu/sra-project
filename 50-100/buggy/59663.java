@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.secure_connect_scan :
            {
                isServer = false;
                android.util.Log.d(groupn.spin_counter.BluetoothBrawlActivity.TAG, "isClient");
                android.content.Intent serverIntent = new android.content.Intent(this, groupn.spin_counter.bluetooth.DeviceListActivity.class);
                startActivityForResult(serverIntent, groupn.spin_counter.BluetoothBrawlActivity.REQUEST_CONNECT_DEVICE_SECURE);
                return true;
            }
        case R.id.discoverable :
            {
                isServer = true;
                android.util.Log.d(groupn.spin_counter.BluetoothBrawlActivity.TAG, "isServer");
                ensureDiscoverable();
                return true;
            }
        case R.id.discoverable_length :
            showDialog(groupn.spin_counter.BluetoothBrawlActivity.DIALOG_ALERT);
            return true;
    }
    return false;
}