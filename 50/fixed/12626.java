@org.junit.Test
public void testPathRegexWithOnlySlash() {
    java.lang.String jsonPathRegex = "/";
    org.batfish.client.Client.validateJsonPathRegex(jsonPathRegex);
}