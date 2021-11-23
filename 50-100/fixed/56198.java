private static void setStringProperty(final java.lang.String paramName, final java.lang.String propertyValue, final jetbrains.buildServer.controllers.BasePropertiesBean bean, final boolean includeEmptyValues) {
    java.lang.String propName = paramName.substring(jetbrains.buildServer.clouds.google.utils.PluginPropertiesUtil.PROPERTY_PREFIX.length());
    if (includeEmptyValues || ((propertyValue.length()) > 0)) {
        bean.setProperty(propName, jetbrains.buildServer.clouds.google.utils.PluginPropertiesUtil.toUnixLineFeeds(propertyValue));
    }
}