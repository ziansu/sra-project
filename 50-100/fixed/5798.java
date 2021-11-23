@org.junit.Test
public void testAddTemp() {
    double[] temperatureSeries = new double[]{ 2 };
    ua.edu.ucu.tempseries.TemperatureSeriesAnalysis seriesAnalysis = new ua.edu.ucu.tempseries.TemperatureSeriesAnalysis(temperatureSeries);
    int expResult = 3;
    int actualResult = seriesAnalysis.addTemps(1.0, 3.1);
    assertEquals(expResult, actualResult, 1.0E-5);
}