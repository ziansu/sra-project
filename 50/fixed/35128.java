@org.junit.Test
public void testCheckDateNowHappy() {
    java.util.Date date = new org.joda.time.DateTime(2005, 3, 26, 12, 0, 0, 0).toDate();
    assertTrue(date.before(fact.dateNow(1)));
}