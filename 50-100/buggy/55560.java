public void setSpeed(double speed) {
    if ((media.getMediaType()) == (de.danoeh.antennapod.feed.MediaType.AUDIO)) {
        de.danoeh.antennapod.util.playback.AudioPlayer audioPlayer = ((de.danoeh.antennapod.util.playback.AudioPlayer) (player));
        if (audioPlayer.canSetSpeed()) {
            audioPlayer.setPlaybackSpeed(((float) (speed)));
            if (de.danoeh.antennapod.AppConfig.DEBUG)
                android.util.Log.d(de.danoeh.antennapod.service.PlaybackService.TAG, ("Playback speed was set to " + speed));
            
            sendNotificationBroadcast(de.danoeh.antennapod.service.PlaybackService.NOTIFICATION_TYPE_PLAYBACK_SPEED_CHANGE, 0);
        }
    }
}