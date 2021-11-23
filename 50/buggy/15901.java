public void unregisterAllReceiver() {
    for (android.content.BroadcastReceiver br : receivers) {
        super.unregisterReceiver(br);
    }
    receivers.clear();
}