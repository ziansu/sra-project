public static void setPublicUrl(java.lang.String publicUrl) throws org.apache.commons.configuration.ConfigurationException {
    io.subutai.common.settings.SystemSettings.validatePublicUrl(publicUrl);
    io.subutai.common.settings.SystemSettings.saveProperty("publicURL", publicUrl);
}