private void registerBroadcastReceiver() {
    android.content.IntentFilter statusIntentFilter = new android.content.IntentFilter(com.njlabs.showjava.Constants.PROCESS_BROADCAST_ACTION);
    registerReceiver(processStatusReceiver, statusIntentFilter);
}