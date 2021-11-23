protected void onHandleIntent(android.content.Intent intent) {
    if (no.hiof.skaalsveen.eskerud.olsen.prototype2.NetworkIntentService.DISCOVER_DEVICES.equals(intent.getAction())) {
        discoverDevices(10);
    }else
        if (no.hiof.skaalsveen.eskerud.olsen.prototype2.NetworkIntentService.BROADCAST_RESPONSE.equals(intent.getAction())) {
            android.util.Log.d(no.hiof.skaalsveen.eskerud.olsen.prototype2.NetworkIntentService.TAG, ((("RESPONSE: " + (intent.getStringExtra(no.hiof.skaalsveen.eskerud.olsen.prototype2.NetworkIntentService.EXTRA_IP))) + " sent ") + (intent.getStringExtra(no.hiof.skaalsveen.eskerud.olsen.prototype2.NetworkIntentService.EXTRA_MESSAGE))));
        }
    
}