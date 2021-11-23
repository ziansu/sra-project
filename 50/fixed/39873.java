@org.junit.Test
public void getDeviceUDIDTest() {
    java.lang.String deviceSerial = driver.getSessionDetails().get("deviceUDID").toString();
    org.junit.Assert.assertNotNull(deviceSerial);
}