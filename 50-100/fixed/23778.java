public void runPerformanceTimer(java.lang.String id, engine.gameTool.VoidFunction logic) {
    if ((runAllDebugTimers) || (monitorActive))
        setRunningPerformanceTimer(id);
    
    long start = java.lang.System.nanoTime();
    logic.apply();
    long time = (java.lang.System.nanoTime()) - start;
    if ((runAllDebugTimers) || (monitorActive))
        appendPerformanceTime(time);
    
}