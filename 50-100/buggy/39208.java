@java.lang.Override
public void onStart() {
    uiLock = new java.lang.Object();
    mode = null;
    FisherUI ui = new FisherUI(this, uiLock);
    synchronized(uiLock) {
        try {
            uiLock.wait();
        } catch (java.lang.InterruptedException e) {
            log(e.getMessage());
        }
    }
    ui.dispose();
    if ((mode) == null) {
        stop(false);
    }
    tunaCount = 0;
    swordfishCount = 0;
    state = Fisher.State.INIT;
    experienceTracker.start(Skill.FISHING);
}