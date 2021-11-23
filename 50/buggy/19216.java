@org.junit.Test
public void createClient() {
    java.lang.System.setProperty("com.example", "abc");
    rtClient = org.mondemand.RealTimeClient.getInstance("test", "127.0.0.1", 9000);
    org.junit.Assert.assertEquals(rtClient.getClass(), org.mondemand.RealTimeClient.class);
}