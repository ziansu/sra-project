@org.junit.Test
public void testStartStop() {
    com.icegreen.greenmail.util.GreenMail service = new com.icegreen.greenmail.util.GreenMail(com.icegreen.greenmail.util.ServerSetupTest.ALL);
    try {
        service.stop();
        service.start();
        service.stop();
        service.reset();
        service.reset();
    } finally {
        service.stop();
    }
}