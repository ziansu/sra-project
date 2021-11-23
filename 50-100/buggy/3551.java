@java.lang.Override
protected void onReceiveResult(int resultCode, android.os.Bundle resultData) {
    switch (resultCode) {
        case com.udacity.neerajbholani.spotifystreamer.services.MediaPlayerService.TRACK_STOPPED :
            updatePlayPauseState();
            break;
        case com.udacity.neerajbholani.spotifystreamer.services.MediaPlayerService.TRACK_PREPARING :
            enablePlayPauseButton(false);
            break;
        case com.udacity.neerajbholani.spotifystreamer.services.MediaPlayerService.TRACK_PREPARED :
            enablePlayPauseButton(true);
            updateSeekBarStatus();
            break;
        default :
            break;
    }
}