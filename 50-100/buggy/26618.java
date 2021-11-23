public static void testGauge(java.lang.String GaugeName, java.util.function.Consumer<java.lang.Long> func) {
    func.accept(1L);
    org.junit.Assert.assertEquals(1, azkaban.metrics.MetricsTestUtility.getGaugeValue(GaugeName));
    func.accept(99L);
    org.junit.Assert.assertEquals(99, azkaban.metrics.MetricsTestUtility.getGaugeValue(GaugeName));
}