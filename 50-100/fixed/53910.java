@org.junit.Test
public void kShortestPathsTest() throws java.lang.Exception {
    org.toradocu.testlib.TestCaseStats stats = test("org.jgrapht.alg.KShortestPaths");
    org.junit.Assert.assertThat(org.toradocu.PRECISION_MESSAGE, stats.getPrecision(), org.hamcrest.number.IsCloseTo.closeTo(0.33, org.toradocu.PRECISION));
    org.junit.Assert.assertThat(org.toradocu.RECALL_MESSAGE, stats.getRecall(), org.hamcrest.number.IsCloseTo.closeTo(0.33, org.toradocu.PRECISION));
}