@org.junit.Test
public void testAsUTCTimeInTimeZone() {
    slash.common.type.CompactCalendar calendar = slash.common.type.CompactCalendar.fromMillis(1000000);
    slash.common.type.CompactCalendar inTimeZone = calendar.asUTCTimeInTimeZone(java.util.TimeZone.getTimeZone("GMT+2"));
    assertEquals(calendar.getCalendar().getTimeInMillis(), 1000000);
    assertEquals(inTimeZone.getCalendar().getTimeInMillis(), (1000000 - (((2 * 60) * 60) * 1000)));
    assertEquals("UTC", inTimeZone.getTimeZoneId());
}