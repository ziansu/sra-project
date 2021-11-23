@org.junit.Before
public void setup() throws java.lang.Exception {
    mockNiFiProperties = org.mockito.Mockito.mock(org.apache.nifi.util.NiFiProperties.class);
    org.mockito.Mockito.when(mockNiFiProperties.getKerberosConfigurationFile()).thenReturn(null);
    kerberosProperties = new org.apache.nifi.hadoop.KerberosProperties(null);
    mockFileSystem = org.mockito.Mockito.mock(org.apache.hadoop.fs.FileSystem.class);
}