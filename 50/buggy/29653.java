@com.google.inject.Provides
@java.lang.Override
protected com.fasterxml.jackson.databind.ObjectMapper provideObjectMapper(com.picdrop.helper.EnvHelper env) {
    java.util.Properties p = env.getPropertiesWithDefault();
    return com.picdrop.json.JacksonConfigProvider.createMapper(p.getProperty("service.json.view"));
}