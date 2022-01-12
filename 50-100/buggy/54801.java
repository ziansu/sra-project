private void playInternal() {
    java.lang.System.out.println("123");
    while ((playerStatus) != (PlayMP3.FINISHED)) {
        java.lang.System.out.println("456");
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