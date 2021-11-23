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
    CloseLIBMODPLUG();
    InvalidatePlayer();
}