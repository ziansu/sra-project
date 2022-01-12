public static boolean pauseLongAudio() {
    if ((AudioPlayer.currentAudio) == null) {
        return false;
    }
    AudioPlayer.currentAudio.pause();
    return true;
}