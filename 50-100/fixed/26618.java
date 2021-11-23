void testGauge(java.lang.String GaugeName, java.util.function.Consumer<java.lang.Long> func) {
    func.accept(1L);
    org.junit.Assert.assertEquals(1, getGaugeValue(GaugeName));
    func.accept(99L);
    org.junit.Assert.assertEquals(99, getGaugeValue(GaugeName));
}