@org.junit.Test
public void testShouldSendMailIsEnabled() {
    assertTrue("Send mail functionaility for testing not enabled in your ssp-config.xml configuration settings for \"send_mail\". This should always be enabled in the testing environment.", service.shouldSendMail());
}