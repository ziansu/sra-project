public void stop() {
    if (((state) == (com.sunflower.catchtherainbow.AudioClasses.SuperAudioPlayer.PlayerState.PLAYING)) || ((state) == (com.sunflower.catchtherainbow.AudioClasses.SuperAudioPlayer.PlayerState.PAUZED))) {
        dispatcher.removeAudioProcessor(this);
        dispatcher.removeAudioProcessor(audioPlayer);
        dispatcher = null;
        state = com.sunflower.catchtherainbow.AudioClasses.SuperAudioPlayer.PlayerState.STOPPED;
    }else
        if ((state) != (com.sunflower.catchtherainbow.AudioClasses.SuperAudioPlayer.PlayerState.STOPPED)) {
            return ;
        }
    
}