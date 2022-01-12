@org.testng.annotations.Test(enabled = true)
public void pingResponseDataPartShouldContainPingForConfigurationResponse() throws java.io.IOException, java.lang.InterruptedException {
    mockTestShs2Riv.expectedMinimumMessageCount(1);
    mockTestShs2Riv.expectedMessagesMatches(org.apache.camel.builder.xml.XPathBuilder.xpath("/ping:PingForConfigurationResponse/ping:pingDateTime").namespace("ping", "urn:riv:itintegration:monitoring:PingForConfigurationResponder:1"));
    se.inera.axel.shs.mime.ShsMessage testMessage = make(shsMessageMaker);
    template().requestBody("direct:testShs2riv", testMessage);
    mockTestShs2Riv.assertIsSatisfied(java.util.concurrent.TimeUnit.SECONDS.toMillis(10));
}