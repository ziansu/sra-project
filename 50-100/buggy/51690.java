void previousMusic() {
    try {
        durationTimer.cancel();
        if ((remembered) != 0) {
            boolean tmpIsPlaying = isPlaying;
            stopMusic();
            if (tmpIsPlaying)
                playLastMusic();
            else
                actualMusicPlaying = getLastOnePlayed();
            
        }else
            playMusic(actualMusicPlaying, true);
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}