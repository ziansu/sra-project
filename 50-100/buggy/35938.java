public static void testGauge(java.lang.String meterName, java.lang.Runnable runnable) {
    runnable.run();
    org.junit.Assert.assertEquals(1, azkaban.metrics.MetricsTestUtility.getGaugeValue(meterName));
    runnable.run();
    runnable.run();
    org.junit.Assert.assertEquals(3, azkaban.metrics.MetricsTestUtility.getGaugeValue(meterName));
}