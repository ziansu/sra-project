private void updatePlayingNotification() {
    if (player.isPlaying()) {
        startForeground(1, makeNotification());
    }
}