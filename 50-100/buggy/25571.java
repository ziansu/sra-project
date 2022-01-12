private void displayData(java.lang.String data) {
    if (data != null) {
        android.util.Log.e("data", (data + "/"));
        dataField.setText(data);
        activity.unregisterReceiver(gattUpdateReceiver);
        activity.unbindService(serviceConnection);
        bluetoothService = null;
    }
}