public void playHandler(android.view.View view) {
    if (!(mediaPlayer.isPlaying())) {
        try {
            if (!(bg.su.fmi.fitness.assistant.player.AudioPlayerController.isPaused)) {
                mediaPlayer.reset();
                mediaPlayer.setDataSource(currentTrack);
                mediaPlayer.prepare();
                bg.su.fmi.fitness.assistant.player.AudioPlayerController.isPaused = false;
            }
            mediaPlayer.start();
        } catch (java.lang.Exception e) {
        }
    }
}