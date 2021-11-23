@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    lastPingWakeupCheck = new me.johannesnz.smsim.WakeupReceiver();
    registerReceiver(lastPingWakeupCheck, new android.content.IntentFilter(android.content.Intent.ACTION_SCREEN_ON));
    me.johannesnz.smsim.Main.mainThread = new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (!(setUp()))
                connFail();
            
        }
    });
    me.johannesnz.smsim.Main.mainThread.start();
    return START_STICKY;
}