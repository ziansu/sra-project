@org.junit.Before
public void startMailServer() {
    mailServer = new com.dumbster.smtp.SimpleSmtpServer(2525);
    java.lang.Thread t = new java.lang.Thread(mailServer);
    t.start();
}