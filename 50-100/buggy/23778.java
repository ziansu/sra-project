public void runPerformanceTimer(java.lang.String id, engine.gameTool.VoidFunction logic) {
    long start = java.lang.System.nanoTime();
    if ((runAllDebugTimers) || (monitorActive))
        setRunningPerformanceTimer(id);
    
    logic.apply();
    if ((runAllDebugTimers) || (monitorActive))
        appendPerformanceTime(((java.lang.System.nanoTime()) - start));
    
}