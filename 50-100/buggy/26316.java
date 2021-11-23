public static int getDuration() {
    if ((wycliffeassociates.recordingapp.Playback.WavPlayer.player) != null) {
        int duration = ((int) ((wycliffeassociates.recordingapp.Playback.WavPlayer.audioData.capacity()) / (((wycliffeassociates.recordingapp.AudioInfo.SAMPLERATE) / 1000.0) * (wycliffeassociates.recordingapp.AudioInfo.BLOCKSIZE))));
        return duration;
    }else {
        return 0;
    }
}