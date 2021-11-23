@org.junit.Before
public void setUp() throws java.lang.Exception {
    com.alesharik.webserver.configuration.Module module = mock(com.alesharik.webserver.configuration.Module.class);
    when(module.getName()).thenReturn("test");
    moduleHolder = new com.alesharik.webserver.configuration.ConfigurationImpl.ModuleHolder(module, "test", config);
}