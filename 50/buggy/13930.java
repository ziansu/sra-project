@org.junit.Test
public void testReturnsDistanceInMiles() {
    com.caltrainapp.MonitoringService TestingMonitoringService = new com.caltrainapp.MonitoringService();
    double result = TestingMonitoringService.getMinutesAway(96560.6, 60000, 96560.6);
    assertEquals(1.0, result);
}