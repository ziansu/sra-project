public synchronized void playAudio(java.lang.String path, java.lang.Runnable finishCallback) {
    if (onceStart) {
        mediaPlayer.reset();
    }
    tryRunFinishCallback();
    audioPath = path;
    this.finishCallback = finishCallback;
    try {
        mediaPlayer.setDataSource(path);
        mediaPlayer.prepare();
        mediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {
            @java.lang.Override
            public void onCompletion(android.media.MediaPlayer mp) {
                tryRunFinishCallback();
            }
        });
        mediaPlayer.start();
        onceStart = true;
    } catch (java.io.IOException e) {
    }
}