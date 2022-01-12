@org.junit.Test
public void withConfigSdkAndMinMax_shouldUseMinMax() throws java.lang.Throwable {
    runner = runnerOf(org.robolectric.RobolectricTestRunnerMultiApiTest.TestMethodWithSdkAndMinMax.class);
    try {
        runner.getChildren();
        org.junit.Assert.fail();
    } catch (java.lang.IllegalArgumentException e) {
        org.assertj.core.api.Assertions.assertThat(e.getMessage()).isEqualTo(("sdk and minSdk/maxSdk may not be specified together" + " (sdk=[16], minSdk=19, maxSdk=21)"));
    }
}