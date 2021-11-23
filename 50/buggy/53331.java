public static void setConfigurationFields(java.lang.Object configurable, org.apache.flume.Context context, java.lang.String subPropertiesPrefix, org.slf4j.Logger logger) throws org.apache.flume.conf.ConfigurationException {
    java.util.Map<java.lang.String, java.lang.String> properties = context.getSubProperties(subPropertiesPrefix);
    org.apache.flume.tools.FlumeBeanConfigurator.setConfigurationFields(configurable, properties, logger);
}