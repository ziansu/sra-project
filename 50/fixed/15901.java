public void unregisterAllReceiver() {
    for (android.content.BroadcastReceiver br : receivers) {
        if (br != null) {
            super.unregisterReceiver(br);
        }
    }
    receivers.clear();
}