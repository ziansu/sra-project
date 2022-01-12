@org.junit.Test
public void testGetRunningTLSServerNominal() throws org.yj.smtpstub.exception.NetworkException {
    org.subethamail.smtp.server.SMTPServer srvr = org.yj.smtpstub.service.smtp.SMTPServerFactory.getRunningTLSServer(2526, "localhost");
    assertNotNull(srvr);
    srvr.stop();
}