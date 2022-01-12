public static void pauseSong(boolean abandonAudioFocus) {
    if (le1.mytube.MusicService.player.isPlaying()) {
        if (abandonAudioFocus) {
            le1.mytube.MusicService.audioManager.abandonAudioFocus(le1.mytube.MusicService.afChangeListener);
        }
        le1.mytube.MusicService.player.pause();
        le1.mytube.MusicService.remoteView.setTextViewText(R.id.btn1, "paused");
        le1.mytube.MusicService.mNotificationManager.notify(666, le1.mytube.MusicService.notification);
    }
}