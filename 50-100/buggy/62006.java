@org.junit.Test
public void testOldBare() throws java.io.IOException, java.lang.InterruptedException {
    listLoggerNames();
    java.lang.System.out.println("testOldBare()");
    cli.dispatch(new java.lang.String[]{ "-ha" });
    listLoggerNames();
    java.lang.System.out.println("testOldBare()");
    waitUntil(() -> getLog().contains("A quorum has been obtained."));
    org.assertj.core.api.Assertions.assertThat(getLog()).contains("Starting clustering...").contains("No cluster-host specified").contains("Any deploymentIDs waiting on a quorum will now be deployed");
}