@org.junit.Test
public void testLatestModification() throws java.lang.Exception {
    tfsCommand.latestModification(workDir);
    org.mockito.Mockito.verify(tfsCommand, org.mockito.Mockito.times(1)).history(null, 1);
}