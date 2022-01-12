public void onPrepared(android.media.MediaPlayer player) {
    this.player.setOnCompletionListener(this);
    if (!(this.prepareOnly)) {
        this.player.start();
        this.setState(org.apache.cordova.media.AudioPlayer.STATE.MEDIA_RUNNING);
        this.seekOnPrepared = 0;
    }else {
        this.setState(org.apache.cordova.media.AudioPlayer.STATE.MEDIA_STARTING);
    }
    this.duration = getDurationInSeconds();
    this.prepareOnly = true;
    sendStatusChange(org.apache.cordova.media.AudioPlayer.MEDIA_DURATION, null, this.duration);
}