@org.junit.Test
public void testIsConstantFunction() {
    assertEquals(false, storm.autoscale.scheduler.RegressionSelectorTest.regressionLinear.isConstantFunction());
    assertEquals(false, storm.autoscale.scheduler.RegressionSelectorTest.regressionExponential.isConstantFunction());
    assertEquals(false, storm.autoscale.scheduler.RegressionSelectorTest.regressionPower.isConstantFunction());
    assertEquals(false, storm.autoscale.scheduler.RegressionSelectorTest.regressionLogarithmic.isConstantFunction());
    assertEquals(true, storm.autoscale.scheduler.RegressionSelectorTest.regressionConstant.isConstantFunction());
}