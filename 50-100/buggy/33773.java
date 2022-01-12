public static void shutdownThreads() {
    if ((com.southwaterfront.parkingtracker.util.Utils.persistenceThread) != null) {
        com.southwaterfront.parkingtracker.util.Utils.worker.induceStop();
        java.lang.Thread.State state = com.southwaterfront.parkingtracker.util.Utils.persistenceThread.getState();
        int tasks = com.southwaterfront.parkingtracker.util.Utils.worker.getNumTasks();
        if ((tasks == 0) && ((state == (java.lang.Thread.State.BLOCKED)) || (state == (java.lang.Thread.State.WAITING))))
            com.southwaterfront.parkingtracker.util.Utils.persistenceThread.interrupt();
        
    }
}