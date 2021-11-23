@org.junit.Test
public void verifiesRequestBasedOnUrlPathOnly() {
    testClient.get("/this/got/requested");
    verify(getRequestedFor(urlPathEqualTo("/this/got")));
}