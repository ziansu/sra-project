@java.lang.Override
public void handleMessage(android.os.Message msg) {
    io.mstream.mstream.player.MStreamAudioService service = mWeakReference.get();
    if ((service != null) && ((service.playbackManager.getPlayback()) != null)) {
        if (service.playbackManager.getPlayback().isPlaying()) {
            android.util.Log.d(io.mstream.mstream.player.MStreamAudioService.TAG, "Ignoring delayed stop since the media player is in use.");
            return ;
        }
        android.util.Log.d(io.mstream.mstream.player.MStreamAudioService.TAG, "Stopping service with delay handler.");
        service.stopSelf();
    }
}