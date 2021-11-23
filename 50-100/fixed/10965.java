@org.testng.annotations.Test(enabled = true)
public void pingRequestShouldBeValid() throws java.lang.Exception {
    context.start();
    se.inera.axel.shs.mime.ShsMessage testMessage = make(shsMessageMaker);
    org.apache.camel.component.mock.MockEndpoint mockEndpoint = getMockEndpoint("mock:ping");
    mockEndpoint.expectedMinimumMessageCount(1);
    mockEndpoint.expectedMessagesMatches(isValidPingRequest(testMessage));
    template().requestBody("direct:testShs2riv", testMessage);
    mockEndpoint.assertIsSatisfied(java.util.concurrent.TimeUnit.SECONDS.toMillis(10));
}