void previousMusic() {
    try {
        if (isPlaying)
            durationTimer.cancel();
        
        if ((remembered) != 0) {
            boolean tmpIsPlaying = isPlaying;
            stopMusic();
            if (tmpIsPlaying)
                playLastMusic();
            else
                actualMusicPlaying = getLastOnePlayed();
            
        }else
            if (isPlaying)
                playMusic(actualMusicPlaying, true);
            
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}