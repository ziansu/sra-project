@java.lang.Override
public void run() {
    try {
        deleteSweep.run();
        replicateSweep.run();
        if ((wp4Sweep) != null) {
            wp4Sweep.run();
        }
        if ((sdnSweep) != null) {
            sdnSweep.run();
        }
    } catch (java.lang.Throwable th) {
        log.log(java.util.logging.Level.SEVERE, "One of the sweepers encountered and error.", th);
        throw th;
    }
}