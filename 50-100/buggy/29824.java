public static int getLocation() {
    if ((wycliffeassociates.recordingapp.Playback.WavPlayer.player) != null) {
        int loc = java.lang.Math.min(((int) ((((wycliffeassociates.recordingapp.Playback.WavPlayer.playbackStart) / 2) + (wycliffeassociates.recordingapp.Playback.WavPlayer.player.getPlaybackHeadPosition())) * (1000.0 / (wycliffeassociates.recordingapp.AudioInfo.SAMPLERATE)))), wycliffeassociates.recordingapp.Playback.WavPlayer.getDuration());
        loc = wycliffeassociates.recordingapp.Playback.WavPlayer.sCutOp.timeAdjusted(loc);
        return loc;
    }else {
        return 0;
    }
}