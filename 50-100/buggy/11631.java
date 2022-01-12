public void baseExpectations() {
    new tests.unit.com.microsoft.azure.iothub.transport.amqps.NonStrictExpectations() {
        {
            mockConfig.getIotHubHostname();
            result = hostName;
            mockConfig.getIotHubName();
            result = hubName;
            mockConfig.getDeviceId();
            result = deviceId;
            mockConfig.getDeviceKey();
            result = deviceKey;
            com.microsoft.azure.iothub.net.IotHubUri.getResourceUri(hostName, deviceId);
            result = resourceUri;
            new com.microsoft.azure.iothub.auth.IotHubSasToken(resourceUri, deviceKey, anyLong);
            result = mockToken;
        }
    };
}