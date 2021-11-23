private void sync(int fps) {
    double lastLoopTime = timer.getLastLoopTime();
    double now = timer.getTime();
    float targetTime = 1.0F / fps;
    while ((now - lastLoopTime) < targetTime) {
        java.lang.Thread.yield();
        try {
            java.lang.Thread.sleep(1);
        } catch (java.lang.InterruptedException ex) {
            java.util.logging.Logger.getLogger(silvertiger.tutorial.lwjgl.core.Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        now = timer.getTime();
    } 
}