@java.lang.Override
public org.apache.logging.log4j.core.config.Configuration getConfiguration(final org.apache.logging.log4j.core.LoggerContext loggerContext, final org.apache.logging.log4j.core.config.ConfigurationSource source) {
    final org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder<org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration> builder;
    try (final java.io.InputStream configStream = source.getInputStream()) {
        builder = new org.apache.log4j.config.Log4j1ConfigurationParser().buildConfigurationBuilder(configStream);
    } catch (java.io.IOException e) {
        throw new org.apache.logging.log4j.core.config.ConfigurationException(("Unable to load " + (source.toString())), e);
    }
    if (builder == null)
        return null;
    
    return builder.build();
}