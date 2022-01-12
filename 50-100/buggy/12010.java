public void pause() {
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.pause();
        audioManager.abandonAudioFocus(audioFocusListener);
        timer = new java.util.Timer();
        final java.util.TimerTask stopPlayerTask = new java.util.TimerTask() {
            @java.lang.Override
            public void run() {
                reset();
                this.cancel();
            }
        };
        timer.schedule(stopPlayerTask, edu.grinnell.kdic.RadioService.STOP_STREAM_DELAY);
        stopForegroundNotification();
    }
    if (wifiLock.isHeld())
        wifiLock.release();
    
}