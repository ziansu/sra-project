@org.junit.Test
public void testBeforeClass() {
    com.carrotsearch.junitbenchmarks.Result result = org.junit.runner.JUnitCore.runClasses(com.carrotsearch.junitbenchmarks.TestAssumptions.AssumeOnBeforeClass.class);
    org.fest.assertions.api.Assertions.assertThat(result.getFailures()).isEmpty();
    org.fest.assertions.api.Assertions.assertThat(result.getIgnoreCount()).isEqualTo(0);
    org.fest.assertions.api.Assertions.assertThat(result.getRunCount()).isEqualTo(0);
    org.fest.assertions.api.Assertions.assertThat(result.getFailureCount()).isEqualTo(0);
}