@org.junit.Test
public void testCovariance() throws java.lang.Exception {
    java.util.ArrayList<java.lang.Double> x = new java.util.ArrayList<>();
    java.util.ArrayList<java.lang.Double> y = new java.util.ArrayList<>();
    x.add(0.0);
    x.add(2.0);
    y.add(0.0);
    y.add(4.0);
    assertEquals(4.0, p5e610.balance.AccelerationData.covar(x, y), 0.001);
}