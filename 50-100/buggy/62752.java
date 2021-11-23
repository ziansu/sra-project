@org.junit.Test
public void testCreateJsonServicesProvider() throws java.io.IOException {
    java.lang.System.out.println("createJsonServicesProvider");
    doNothing().when(instance).createServicesProvider(anyString(), anyString());
    java.lang.String result = instance.createJsonServicesProvider();
    assertThat(result).startsWith("srv_");
}