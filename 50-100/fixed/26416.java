public static boolean safeToShutdown() {
    if ((plt.gui.ExecutionProgress.threadActiveStatus) == null) {
        return true;
    }
    int numOfDeactivatedSubThreads = 0;
    for (java.util.Map.Entry pairs : plt.gui.ExecutionProgress.threadActiveStatus.entrySet()) {
        if (!(plt.gui.ExecutionProgress.threadActiveStatus.get(pairs))) {
            numOfDeactivatedSubThreads++;
        }
    }
    if (numOfDeactivatedSubThreads == (plt.gui.ExecutionProgress.threadActiveStatus.size())) {
        return true;
    }else {
        return false;
    }
}