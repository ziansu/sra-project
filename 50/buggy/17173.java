public org.kurento.test.client.BrowserClient build() {
    hostAddress = org.kurento.commons.PropertiesManager.getProperty(org.kurento.test.client.BrowserClient.TEST_PUBLIC_IP_PROPERTY, org.kurento.test.client.BrowserClient.TEST_PUBLIC_IP_DEFAULT);
    return new org.kurento.test.client.BrowserClient(this);
}