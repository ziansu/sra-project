public static void setConfigurationFields(java.lang.Object configurable, org.apache.flume.Context context) throws org.apache.flume.conf.ConfigurationException {
    java.lang.Class<?> clazz = configurable.getClass();
    java.util.Map<java.lang.String, java.lang.String> properties = context.getSubProperties(((clazz.getSimpleName()) + "."));
    org.apache.flume.tools.FlumeBeanConfigurator.setConfigurationFields(configurable, properties);
}