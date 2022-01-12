@org.junit.Test
public void stopOnce() {
    org.sonar.api.utils.TimeProfiler profiler = new org.sonar.api.utils.TimeProfiler(logger);
    profiler.start("Cycle analysis");
    profiler.stop();
    profiler.stop();
    profiler.stop();
    verify(logger, times(1)).info(anyString());
    verify(logger, times(1)).info(anyString(), anyString(), anyInt());
}