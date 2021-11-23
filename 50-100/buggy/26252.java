private void handleMediaPlayerError(com.princecoder.nanodegree.spotifytreamer.MediaPlayerService.MEDIAPLAYER_SERVICE_ERROR error) {
    android.content.Intent intent = new android.content.Intent(com.princecoder.nanodegree.spotifytreamer.MediaPlayerService.SERVICE_ERROR_NAME);
    switch (error) {
        case MediaPlayer :
            intent.putExtra(com.princecoder.nanodegree.spotifytreamer.MediaPlayerService.EXTRA_ERROR, com.princecoder.nanodegree.spotifytreamer.MediaPlayerService.MEDIAPLAYER_SERVICE_ERROR.MediaPlayer.ordinal());
            break;
        case InvalidTrack :
            intent.putExtra(com.princecoder.nanodegree.spotifytreamer.MediaPlayerService.EXTRA_ERROR, com.princecoder.nanodegree.spotifytreamer.MediaPlayerService.MEDIAPLAYER_SERVICE_ERROR.InvalidTrack.ordinal());
            break;
        case Connection :
            intent.putExtra(com.princecoder.nanodegree.spotifytreamer.MediaPlayerService.EXTRA_ERROR, com.princecoder.nanodegree.spotifytreamer.MediaPlayerService.MEDIAPLAYER_SERVICE_ERROR.Connection.ordinal());
            break;
    }
    if (mp.isPlaying())
        StopProgressBar();
    
    getApplicationContext().sendBroadcast(intent);
}