@org.junit.Test
public void test_Convert_TimeZone() {
    try {
        org.junit.Assert.assertEquals(testISOTime_02, net.vexelon.currencybg.srv.utils.DateTimeUtils.toTimeZone(testISOTime_01, Defs.DATETIME_ZONE_FORMAT, "Europe/Sofia"));
        org.junit.Assert.assertEquals(testISOTime_01, net.vexelon.currencybg.srv.utils.DateTimeUtils.toTimeZone(testISOTime_02, Defs.DATETIME_ZONE_FORMAT, "Europe/Berlin"));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        org.junit.Assert.fail(e.getMessage());
    }
}