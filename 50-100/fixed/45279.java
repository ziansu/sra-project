@org.junit.Test
public void TestStartBlackout() throws java.lang.Exception {
    boolean callSuccessfull = true;
    S71200URLCommunicator.Implementations.PneumanBlackoutCommunicator testComm = new S71200URLCommunicator.Implementations.PneumanBlackoutCommunicator();
    testComm.configure(S71200URLCommunicatorTests.IntegrationTests.PneumanBlackoutCommunicatorIntegrationTests.TEST_IP, S71200URLCommunicatorTests.IntegrationTests.PneumanBlackoutCommunicatorIntegrationTests.TEST_USER, S71200URLCommunicatorTests.IntegrationTests.PneumanBlackoutCommunicatorIntegrationTests.TEST_PASSWORD);
    try {
        testComm.startBlackout();
    } catch (java.lang.Exception e) {
        callSuccessfull = false;
    }
    org.junit.Assert.assertTrue(callSuccessfull);
}