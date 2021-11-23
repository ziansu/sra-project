public void verifyMocks() throws java.io.IOException {
    org.mockito.Mockito.verify(tfsCommand, org.mockito.Mockito.times(1)).initializeWorkspace(workDir);
    org.mockito.Mockito.verify(tfsCommand, org.mockito.Mockito.times(1)).unMap();
}