@org.testng.annotations.Test(description = "Test the client connection establishment and broadcast.")
public void testClientConnected() {
    java.lang.String expectedText = "new client connected";
    org.wso2.carbon.messaging.CarbonMessage client1Message = org.ballerinalang.testutils.MessageUtils.generateWebSocketOnOpenMessage(session1, uri);
    org.wso2.carbon.messaging.CarbonMessage client2Message = org.ballerinalang.testutils.MessageUtils.generateWebSocketOnOpenMessage(session2, uri);
    org.ballerinalang.testutils.Services.invoke(client1Message);
    org.ballerinalang.testutils.Services.invoke(client2Message);
    org.testng.Assert.assertEquals(session1.getTextReceived(), expectedText);
}