@org.junit.Test
public void createClient() {
    java.lang.System.setProperty("com.example", "abc");
    org.junit.Assert.assertEquals(rtClient.getClass(), org.mondemand.RealTimeClient.class);
}