public static org.backmeup.model.dto.PluginProfileDTO getProfileDummySource() {
    java.lang.String pluginId = "org.backmeup.dummy";
    java.lang.String profileName = "DummySourceProfile";
    org.backmeup.model.spi.PluginDescribable.PluginType profileType = org.backmeup.model.spi.PluginDescribable.PluginType.Source;
    org.backmeup.model.dto.AuthDataDTO authData = org.backmeup.tests.integration.utils.TestDataManager.getAuthDataBackmeupDummyStorage();
    org.backmeup.model.dto.PluginProfileDTO pluginProfile = new org.backmeup.model.dto.PluginProfileDTO();
    pluginProfile.setTitle(profileName);
    pluginProfile.setPluginId(pluginId);
    pluginProfile.setProfileType(profileType);
    pluginProfile.setAuthData(authData);
    return pluginProfile;
}