public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    player.start();
    android.util.Log.v("FSDF", "Initializing sounds...");
    return 1;
}