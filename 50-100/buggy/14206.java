@org.junit.Test
public void testRunWithProblematicProbe() throws java.lang.Throwable {
    metricsRegistry.register(this, "broken", com.hazelcast.internal.metrics.ProbeLevel.MANDATORY, new com.hazelcast.internal.metrics.LongProbeFunction() {
        @java.lang.Override
        public long get(java.lang.Object source) throws java.lang.Exception {
            throw new java.lang.RuntimeException("error");
        }
    });
    assertTrueEventually(new com.hazelcast.test.AssertTask() {
        @java.lang.Override
        public void run() throws java.lang.Exception {
            logWriter.clean();
            plugin.run(logWriter);
            assertContains("broken=java.lang.RuntimeException:error");
        }
    });
}