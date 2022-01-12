@org.junit.Test
public void testEstimateYCoordinate() {
    assertEquals(0.0, storm.autoscale.scheduler.RegressionSelectorTest.regressionRandom.estimateYCoordinate(12), 0.001);
    assertEquals(166.393, storm.autoscale.scheduler.RegressionSelectorTest.regressionLinear.estimateYCoordinate(12), 0.001);
    assertEquals(1.3854892513E7, storm.autoscale.scheduler.RegressionSelectorTest.regressionExponential.estimateYCoordinate(12), 0.001);
    assertEquals(31.643, storm.autoscale.scheduler.RegressionSelectorTest.regressionPower.estimateYCoordinate(12), 0.001);
    assertEquals(0.546, storm.autoscale.scheduler.RegressionSelectorTest.regressionLogarithmic.estimateYCoordinate(12), 0.001);
    assertEquals(20.0, storm.autoscale.scheduler.RegressionSelectorTest.regressionConstant.estimateYCoordinate(12), 0.001);
}