@org.junit.Test
public void testRegularBareCommandWithClusterHost() {
    listLoggerNames();
    cli.dispatch(new java.lang.String[]{ "bare" , "-cluster-host" , "127.0.0.1" });
    listLoggerNames();
    waitUntil(() -> getLog().contains("A quorum has been obtained."));
    assertThatVertxInstanceHasBeenCreated();
    org.assertj.core.api.Assertions.assertThat(getLog()).contains("Starting clustering...").doesNotContain("No cluster-host specified").contains("Any deploymentIDs waiting on a quorum will now be deployed");
}