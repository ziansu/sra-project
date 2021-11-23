public static void playSong(boolean gainAudioFocus) {
    if ((le1.mytube.MusicService.player) != null) {
        if (gainAudioFocus) {
            le1.mytube.MusicService.audioManager.requestAudioFocus(le1.mytube.MusicService.afChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN);
        }
        le1.mytube.MusicService.player.start();
        le1.mytube.MusicService.player.setVolume(1.0F, 1.0F);
        le1.mytube.MusicService.remoteView.setTextViewText(R.id.btn1, "playing");
        le1.mytube.MusicService.mNotificationManager.notify(666, le1.mytube.MusicService.notification);
    }
}