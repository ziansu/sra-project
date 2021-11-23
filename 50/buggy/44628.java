@org.testng.annotations.Test
public void testClientProtocolConstructor() {
    ro.develbox.protocol.Protocol clientP = new ro.develbox.protocol.client.ClientProtocol(responder, sender);
    org.testng.Assert.assertTrue(((clientP.commandAnnotation) == (ro.develbox.annotation.ClientCommand.class)));
}