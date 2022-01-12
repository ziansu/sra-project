@com.google.inject.Provides
@javax.inject.Singleton
@java.lang.Override
protected com.fasterxml.jackson.databind.ObjectMapper provideObjectMapper(@com.picdrop.guice.names.Config
java.util.Properties p) {
    return com.picdrop.json.JacksonConfigProvider.createMapper(p.getProperty("service.json.view"));
}