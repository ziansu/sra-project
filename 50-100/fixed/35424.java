private void initMediaPlayerService() {
    android.content.ServiceConnection serviceConnection = new android.content.ServiceConnection() {
        @java.lang.Override
        public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
            agersant.polaris.MediaPlayerService.MediaPlayerBinder binder = ((agersant.polaris.MediaPlayerService.MediaPlayerBinder) (service));
            mediaPlayerService = binder.getService();
            agersant.polaris.PlaybackQueueState.loadFromDisk();
        }

        @java.lang.Override
        public void onServiceDisconnected(android.content.ComponentName componentName) {
        }
    };
    android.content.Intent intent = new android.content.Intent(this, agersant.polaris.MediaPlayerService.class);
    bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
}