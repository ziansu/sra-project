@org.junit.Before
public void setup() throws java.lang.Exception {
    org.mockito.MockitoAnnotations.initMocks(this);
    handler = new com.microsoft.azure.maven.webapp.handlers.NullRuntimeHandlerImpl();
}