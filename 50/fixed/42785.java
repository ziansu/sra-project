public void runConstantPerformanceTimer(java.lang.String id, engine.gameTool.VoidFunction logic) {
    setRunningPerformanceTimer(id);
    long start = java.lang.System.nanoTime();
    logic.apply();
    appendPerformanceTime(((java.lang.System.nanoTime()) - start));
}