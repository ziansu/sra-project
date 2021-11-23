private void playInternal() {
    while ((playerStatus) != (PlayMP3.FINISHED)) {
        try {
            if (!(player.play(1))) {
                break;
            }
        } catch (final javazoom.jl.decoder.JavaLayerException e) {
            break;
        }
        synchronized(playerLock) {
            while ((playerStatus) == (PlayMP3.PAUSED)) {
                try {
                    playerLock.wait();
                } catch (final java.lang.InterruptedException e) {
                    break;
                }
            } 
        }
    } 
    close();
}