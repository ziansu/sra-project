@java.lang.Override
protected void onStart() {
    super.onStart();
    android.content.Intent intent = new android.content.Intent(this, com.sarabjeet.musical.sync.MusicPlayerService.class);
    intent.setAction("SERVICE_START");
    startService(intent);
    bindService(intent, mServiceConnection, Context.BIND_AUTO_CREATE);
    android.util.Log.d("ON_START", "Starting Service");
    android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(receiver, new android.content.IntentFilter(com.sarabjeet.musical.utils.Constants.PLAYER.PLAY));
}