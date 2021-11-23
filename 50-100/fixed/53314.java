@org.testng.annotations.DataProvider(name = "comandValidationDp")
public java.lang.Object[][] comandValidationDp() {
    return new java.lang.Object[][]{ new java.lang.Object[]{ new ro.develbox.protocol.server.ServerProtocol(responder, sender) {    } , new ro.develbox.commands.ClientTypeTestCommand() } , new java.lang.Object[]{ new ro.develbox.protocol.client.ClientProtocol(responder, sender) {    } , new ro.develbox.commands.ServerTypeTestCommand() } };
}