public void StopAndClose() {
    PausePlay();
    boolean retry = true;
    StopThread();
    while (retry) {
        try {
            join();
            retry = false;
        } catch (java.lang.InterruptedException e) {
        }
    } 
    com.peculiargames.andmodplug.PlayerThread.CloseLIBMODPLUG();
    InvalidatePlayer();
}