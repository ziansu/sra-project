@org.junit.Test
public void testPercent() {
    double subVal = 2;
    double totalVal = 3;
    assertEquals("zero total", 0.0, jenkins.plugins.build_metrics.stats.StatsMath.getPercent(subVal, 0), 0);
    assertEquals("2/3", 66.67, jenkins.plugins.build_metrics.stats.StatsMath.getPercent(subVal, totalVal), 0);
    assertEquals("1/1", 100.0, jenkins.plugins.build_metrics.stats.StatsMath.getPercent(1, 1), 0);
    assertEquals("3/2", 150.0, jenkins.plugins.build_metrics.stats.StatsMath.getPercent(3, 2), 0);
}