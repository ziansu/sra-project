@org.testng.annotations.Test
public void testGets() throws java.lang.Exception {
    com.paypal.selion.utils.ConfigParser config = com.paypal.selion.utils.ConfigParser.parse();
    int i = config.getInt("Key1");
    java.lang.String s = config.getString("Key2");
    long l = config.getLong("Key3");
    assertEquals(i, 1000);
    assertEquals(s, "Sample");
    assertEquals(l, 250000000L);
}