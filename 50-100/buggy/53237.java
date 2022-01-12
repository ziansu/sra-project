@org.junit.Test
public void testDeviceRegistration() throws java.io.IOException {
    de.sevenfactory.helium.mock.MockServer server = new de.sevenfactory.helium.mock.MockServer().enqueueAcceptKey().start();
    de.sevenfactory.helium.mock.MockDeviceStore store = new de.sevenfactory.helium.mock.MockDeviceStore();
    de.sevenfactory.helium.TokenRepository tokenRepository = new de.sevenfactory.helium.TokenRepository(new de.sevenfactory.helium.mock.MockConfig(server.getUrl("/demo-auth/v1")), store);
    java.lang.String token = tokenRepository.getDeviceToken();
    assertEquals(token.length(), 32);
    server.shutdown();
}