@org.testng.annotations.Test(expectedExceptions = { ro.develbox.protocol.exceptions.ProtocolViolatedException.class }, expectedExceptionsMessageRegExp = ".*Command invalid.*")
public void testServerCommandRejectedOnClient() throws java.lang.Exception {
    ro.develbox.protocol.client.ClientProtocol clientP = new ro.develbox.protocol.client.ClientProtocol(responder, sender) {    };
    clientP.commandReceived(new ro.develbox.commands.ServerTypeTestCommand());
}