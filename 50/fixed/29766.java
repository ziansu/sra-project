@org.junit.Test
public void testLatestModification() throws java.lang.Exception {
    tfsCommand.latestModification(workDir);
    verify(tfsCommand, times(1)).history(null, 1);
}