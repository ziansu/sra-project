@java.lang.Override
public void onPrepared(android.media.MediaPlayer mediaPlayer) {
    if (!(fromNotification)) {
        android.os.Bundle returnBundle = new android.os.Bundle();
        playTrackResultReceiver.send(com.dnbitstudio.spotifystreamer.services.PlayTrackService.NOTIFY_MP_PREPARED, returnBundle);
    }
    createNotification();
    mediaPlayer.start();
}