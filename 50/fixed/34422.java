@java.lang.Override
public void run() {
    try {
        this.setFile();
        this.scheduleNextRollover();
        this.removeOldFiles();
    } catch (java.lang.Throwable t) {
        t.printStackTrace(java.lang.System.err);
    }
}