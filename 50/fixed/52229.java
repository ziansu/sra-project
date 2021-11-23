@org.junit.Test
public void testDateNow() {
    java.util.Date date = fact.dateNow((-10));
    assertNotNull(date);
}