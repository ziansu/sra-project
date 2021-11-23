void testGauge(java.lang.String meterName, java.lang.Runnable runnable) {
    runnable.run();
    org.junit.Assert.assertEquals(1, getGaugeValue(meterName));
    runnable.run();
    runnable.run();
    org.junit.Assert.assertEquals(3, getGaugeValue(meterName));
}