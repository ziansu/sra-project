@org.junit.Test
public void TestTrafficIT() {
    org.roi.itlab.cassandra.IntensityMap intensityMap = new org.roi.itlab.cassandra.IntensityMap();
    intensityMap.put(startTimes, routes);
    java.lang.System.out.println(("\n" + intensityMap));
    org.junit.Assert.assertEquals(intensityMap.getIntensity(org.roi.itlab.cassandra.Routing.getEdge(12205), 1488186250000L), 3);
    org.junit.Assert.assertEquals(intensityMap.getIntensity(org.roi.itlab.cassandra.Routing.getEdge(426664), 1488186250000L), 1);
    org.junit.Assert.assertNotEquals(intensityMap.getIntensity(org.roi.itlab.cassandra.Routing.getEdge(426664), 1488185900000L), 1);
}