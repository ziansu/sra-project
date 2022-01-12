@org.junit.Test
public void run() throws java.lang.Exception {
    performance.VideoMaskingTest.startTimer("run_without_masking");
    runWithoutMasking();
    long baseline = performance.VideoMaskingTest.endTimer("run_without_masking");
    performance.VideoMaskingTest.startTimer("run_with_three_maskings");
    runWithThreeMaskings();
    long durationWithProcessing = performance.VideoMaskingTest.endTimer("run_with_three_maskings");
    double ratio = performance.VideoMaskingTest.calculateRatio(durationWithProcessing, baseline);
    java.lang.System.out.printf("Ratio: %f\n", ratio);
    org.junit.Assert.assertThat(ratio, org.hamcrest.Matchers.lessThan(10.0));
}