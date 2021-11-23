@org.junit.Test(expected = AdaptiveMediaImageConfigurationException.RequiredWidthOrHeightException.class)
public void testUpdateConfigurationEntryWithoutMaxHeightNorMaxWidth() throws java.lang.Exception {
    com.liferay.adaptive.media.image.configuration.AdaptiveMediaImageConfigurationHelper configurationHelper = serviceTracker.getService();
    java.util.Map<java.lang.String, java.lang.String> properties = new java.util.HashMap<>();
    properties.put("max-height", "100");
    properties.put("max-width", "100");
    configurationHelper.addAdaptiveMediaImageConfigurationEntry(com.liferay.portal.kernel.test.util.TestPropsValues.getCompanyId(), "one", "1", properties);
    properties = new java.util.HashMap<>();
    configurationHelper.updateAdaptiveMediaImageConfigurationEntry(com.liferay.portal.kernel.test.util.TestPropsValues.getCompanyId(), "1", "one", "1", properties);
}