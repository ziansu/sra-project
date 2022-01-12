public static void stop() {
    if ((wycliffeassociates.recordingapp.Playback.WavPlayer.isPlaying()) || (wycliffeassociates.recordingapp.Playback.WavPlayer.isPaused())) {
        wycliffeassociates.recordingapp.Playback.WavPlayer.keepPlaying = false;
        wycliffeassociates.recordingapp.Playback.WavPlayer.player.pause();
        wycliffeassociates.recordingapp.Playback.WavPlayer.player.stop();
        if ((wycliffeassociates.recordingapp.Playback.WavPlayer.playbackThread) != null) {
            wycliffeassociates.recordingapp.Playback.WavPlayer.forceBreakOut = true;
            wycliffeassociates.recordingapp.Playback.WavPlayer.playbackThread = null;
        }
        wycliffeassociates.recordingapp.Playback.WavPlayer.player.flush();
    }
}