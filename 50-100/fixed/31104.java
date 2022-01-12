private static void setEncryptedProperty(final java.lang.String paramName, final java.lang.String value, final jetbrains.buildServer.controllers.BasePropertiesBean bean, final boolean includeEmptyValues) {
    java.lang.String propName = paramName.substring(jetbrains.buildServer.clouds.google.utils.PluginPropertiesUtil.ENCRYPTED_PROPERTY_PREFIX.length());
    java.lang.String propertyValue = jetbrains.buildServer.serverSide.crypt.RSACipher.decryptWebRequestData(value);
    if ((propertyValue != null) && (includeEmptyValues || ((propertyValue.length()) > 0))) {
        bean.setProperty(propName, jetbrains.buildServer.clouds.google.utils.PluginPropertiesUtil.toUnixLineFeeds(propertyValue));
    }
}