@com.google.inject.Provides
@java.lang.Override
protected com.fasterxml.jackson.databind.ObjectMapper provideObjectMapper(com.picdrop.helper.EnvHelper env) {
    return appModule.provideObjectMapper(env);
}