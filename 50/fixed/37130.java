@org.junit.Test
public void testDisconnect() {
    java.lang.System.out.println("disconnect");
    boolean result = bankserver.DBConnector.disconnect();
    assertTrue(result);
}