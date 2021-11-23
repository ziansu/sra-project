@tests.integration.com.microsoft.azure.sdk.iot.iothubservices.Test(timeout = tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.MAX_MILLISECS_TIMEOUT_KILL_TEST)
public void testSendReportedPropertiesWithX509() throws com.microsoft.azure.sdk.iot.service.exceptions.IotHubException, java.io.IOException, java.lang.InterruptedException, java.net.URISyntaxException {
    setUpX509Device();
    tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.x509DeviceUnderTest.dCDeviceForTwin.createNewReportedProperties(tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.MAX_PROPERTIES_TO_TEST);
    tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.x509DeviceClient.sendReportedProperties(tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.x509DeviceUnderTest.dCDeviceForTwin.getReportedProp());
    java.lang.Thread.sleep(tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.MAXIMUM_TIME_TO_WAIT_FOR_IOTHUB);
    assertEquals(tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.x509DeviceUnderTest.deviceTwinStatus, tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.STATUS.SUCCESS);
    java.lang.Thread.sleep(tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.MAXIMUM_TIME_FOR_IOTHUB_PROPAGATION_BETWEEN_DEVICE_SERVICE_CLIENTS);
    int actualReportedPropFound = readReportedProperties(tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.x509DeviceUnderTest, tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.PROPERTY_KEY, tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.PROPERTY_VALUE);
    assertEquals(tests.integration.com.microsoft.azure.sdk.iot.iothubservices.DeviceTwinIT.MAX_PROPERTIES_TO_TEST.intValue(), actualReportedPropFound);
}