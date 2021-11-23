public static void addThread(java.lang.Thread thd, java.lang.String thdDesc) {
    if (DebugUtils.canDebug(ThreadMonitor.class, ThreadMonitor.DebugFlag.WARN_NO_THD_PROGRESS, ThreadMonitor.DebugFlag.THD_LIVENESS_INFO, ThreadMonitor.DebugFlag.RUNTIME_INFO)) {
        synchronized(ThreadMonitor.monitoredThds) {
            ThreadMonitor.monitoredThds.put(thd, new ThreadMonitor.ThreadInfo(thd, thdDesc));
            if (!(ThreadMonitor.monitoringThd.isAlive()))
                ThreadMonitor.monitoringThd.start();
            
        }
    }
}