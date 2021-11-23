public void run(int sleepTime) {
    while ((!(_programComplete)) && (!(com.laboon.SystemSettings.checkForStop()))) {
        if (sleepTime > 0) {
            try {
                java.lang.Thread.sleep(sleepTime);
            } catch (java.lang.InterruptedException iex) {
            }
        }
        resetUpdates();
        _mp.highlightChar(_pa, _x, _y);
        executeOneStep();
        _mp.setStack(_ps.toString());
        _mp.refresh(_updateTa, _updateStack, _updateOutput);
    } 
}