public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (net.aircable.nativeairi.BluetoothInquiry.D)
        android.util.Log.d(net.aircable.nativeairi.BluetoothInquiry.TAG, ("onItemClickListener " + position));
    
    unregisterReceiver(mReceiver);
    mReceiver = null;
    android.content.Intent i = new android.content.Intent();
    i.putExtra(net.aircable.nativeairi.BluetoothInquiry.EXTRA_ADDRESS, mArrayAdapter.getItem(position).address);
    setResult(net.aircable.nativeairi.RESULT_OK, i);
    running = false;
    finish();
}