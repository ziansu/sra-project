@org.junit.Test
public void testRoundTwoDecimals() {
    double d1 = 1.2345;
    assertEquals((d1 + " rounded to two decimal places"), 1.23, jenkins.plugins.build_metrics.stats.StatsMath.roundTwoDecimals(d1), 0);
}