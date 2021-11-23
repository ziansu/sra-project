@org.junit.Test
public void testOverrideOutputLimits() {
    xbot.common.math.PIDManager manager = new xbot.common.math.PIDManager("test", injector.getInstance(xbot.common.properties.XPropertyManager.class), 1, 0, 0, 0, 0.5, (-0.25));
    double output = manager.calculate(100, 0);
    org.junit.Assert.assertEquals(0.5, output, 0.001);
    output = manager.calculate((-100), 0);
    org.junit.Assert.assertEquals((-0.25), output, 0.001);
}