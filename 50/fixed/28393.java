public void onWakeupReceived(android.content.Context applicationContext, android.content.Intent intent) {
    com.magnet.mmx.client.common.Log.d(com.magnet.mmx.client.api.MMX.TAG, "onWakeupReceived() start");
    com.magnet.mmx.client.api.MMX.wakeup(applicationContext, intent);
}