public void sendPlcCommand(org.apache.http.client.methods.HttpPost postMethod) throws java.io.IOException {
    org.apache.http.client.CookieStore sessionStore = cookieStoreFactory.createCookieStore();
    if (!(loginToPlc(sessionStore))) {
        throw new java.io.IOException(((((("Could not authenticate with PLC! IP: " + (_plcIpAddress)) + " User: ") + (_plcLogin)) + "Pass: ") + (_plcPassword)));
    }
    try (org.apache.http.impl.client.CloseableHttpClient commandClient = clientFactory.createHttpClient(sessionStore)) {
        connectGetContent(commandClient, postMethod);
    }
    logoutOfPlc(sessionStore);
}