public static void resumeLongAudio() {
    if ((AudioPlayer.currentAudio) == null)
        return ;
    
    AudioPlayer.currentAudio.play();
}