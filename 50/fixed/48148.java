@com.google.inject.Provides
@com.google.inject.Singleton
public com.fasterxml.jackson.databind.ObjectMapper providesObjectMapper() {
    return new com.fasterxml.jackson.databind.ObjectMapper();
}