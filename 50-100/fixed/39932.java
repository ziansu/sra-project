@org.junit.Test
public void testGetCurrentTemp() throws java.lang.Exception {
    com.pinorman.wxmon.sensors.TempHistoryImpl que = new com.pinorman.wxmon.sensors.TempHistoryImpl();
    org.junit.Assert.assertEquals("testGetCurrentTemp failed with empty que", que.getCurrentTemp(), (-40), 0.0);
    com.pinorman.wxmon.sensors.TempReading t1 = new com.pinorman.wxmon.sensors.TempReading(20, java.time.LocalDateTime.now());
    com.pinorman.wxmon.sensors.TempReading t2 = new com.pinorman.wxmon.sensors.TempReading(40);
    que.add(t1);
    que.add(t2);
    org.junit.Assert.assertEquals("testGetCurrentTemp failed to return current value", que.getCurrentTemp(), 40, 0.0);
}