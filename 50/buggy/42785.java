public void runConstantPerformanceTimer(java.lang.String id, engine.gameTool.VoidFunction logic) {
    long start = java.lang.System.nanoTime();
    setRunningPerformanceTimer(id);
    logic.apply();
    appendPerformanceTime(((java.lang.System.nanoTime()) - start));
}