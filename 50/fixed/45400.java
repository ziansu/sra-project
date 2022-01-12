@org.junit.Test
public void testGetInstanceString() {
    org.joda.time.DateTimeZone instance = org.apache.phoenix.cache.JodaTimezoneCache.getInstance("America/St_Vincent");
    org.junit.Assert.assertNotNull(instance);
}