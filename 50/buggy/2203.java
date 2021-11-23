public static void resumeLongAudio(java.lang.String fname) {
    if (fname == null)
        return ;
    
    if (AudioPlayer.currentAudio.containsKey(fname)) {
        AudioPlayer.currentAudio.get(fname).play();
    }
}