public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    mediaPlayerService = ((com.bryantp.spotifystreamer.service.MediaPlayerService.MediaPlayerServiceBinder) (service)).getMediaPlayerService();
    bound = true;
    if (!(loaded)) {
        mediaPlayerService.loadTrack(trackInfo.getTrackUri(), true);
    }
    com.bryantp.spotifystreamer.service.MediaPlayerService.MediaPlayerState mediaPlayerState = mediaPlayerService.getMediaPlayerState();
}