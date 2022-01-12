@org.junit.Test
public void test_Modify_Date_Layout() {
    try {
        org.junit.Assert.assertEquals("2016-07-16 21:40:06", net.vexelon.currencybg.srv.utils.DateTimeUtils.removeTimeZone(testISOTime_01, Defs.DATETIME_ZONE_FORMAT, "Europe/Berlin"));
        org.junit.Assert.assertEquals("2016-07-16 22:40:06", net.vexelon.currencybg.srv.utils.DateTimeUtils.removeTimeZone(testISOTime_02, Defs.DATETIME_ZONE_FORMAT, "Europe/Sofia"));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        org.junit.Assert.fail(e.getMessage());
    }
}