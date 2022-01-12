@org.junit.Test
public void testOldBare() throws java.io.IOException, java.lang.InterruptedException {
    cli.dispatch(new java.lang.String[]{ "-ha" });
    waitUntil(() -> getLog().contains("A quorum has been obtained."));
    org.assertj.core.api.Assertions.assertThat(getLog()).contains("Starting clustering...").contains("No cluster-host specified").contains("Any deploymentIDs waiting on a quorum will now be deployed");
}