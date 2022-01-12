public static void runTask(java.lang.Runnable run, int tickDelay) {
    synchronized(de.robotricker.transportpipes.PipeThread.tickList) {
        de.robotricker.transportpipes.PipeThread.tickList.put(run, tickDelay);
    }
}