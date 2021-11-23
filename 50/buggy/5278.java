@org.junit.Before
public void startMailServer() {
    mailServer = com.dumbster.smtp.SimpleSmtpServer.start(2525);
}