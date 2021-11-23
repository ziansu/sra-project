@org.junit.Test
public void testDisconnect() {
    java.lang.System.out.println("disconnect");
    boolean expResult = true;
    boolean result = bankserver.DBConnector.disconnect();
    assertEquals(expResult, result);
}