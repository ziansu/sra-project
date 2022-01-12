@org.junit.Test
public void testInit() throws java.io.IOException {
    driver.init();
    mockDevice.dumpRegisters();
    mockDevice.dumpByteStream();
    org.junit.Assert.assertEquals(1, mockDevice.readRegister(PCA9685Device.MODE1));
    org.junit.Assert.assertEquals(4, mockDevice.readRegister(PCA9685Device.MODE2));
}