public void verifyMocks() throws java.io.IOException {
    verify(tfsCommand, times(1)).initializeWorkspace(workDir);
    verify(tfsCommand, times(1)).unMap();
}