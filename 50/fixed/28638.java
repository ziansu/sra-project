public static void setupOSGiTestEnvironment() {
    org.wso2.carbon.osgi.utils.OSGiTestUtils.setCarbonHome();
    org.wso2.carbon.osgi.utils.OSGiTestUtils.setRequiredSystemProperties();
    org.wso2.carbon.osgi.utils.OSGiTestUtils.setStartupTime();
}