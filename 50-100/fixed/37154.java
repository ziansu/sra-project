@org.junit.Test
public void testBroadcastListen() {
    try {
        Network network = new Network("228.5.6.7", 49153);
        network.broadcast("hello world");
        java.lang.String message = network.listen();
        network.close();
        org.junit.Assert.assertEquals("hello world", message);
    } catch (java.io.IOException exception) {
        org.junit.Assert.fail(exception.getMessage());
    }
}