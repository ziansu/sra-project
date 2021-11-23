@org.testng.annotations.Test(dependsOnMethods = "testBootUpNewJobConfigs")
public void testUpdatedNewJobConfigs() throws java.lang.Exception {
    java.lang.System.out.println("testUpdatedNewJobConfigs START");
    final java.net.URL url = gobblin.aws.GobblinAWSClusterLauncherTest.class.getClassLoader().getResource(gobblin.aws.AWSJobConfigurationManagerTest.JOB_SECOND_ZIP);
    final java.lang.String jobConfZipUri = getJobConfigZipUri(new java.io.File(url.toURI()));
    this.countDownLatchUpdate.await();
    org.testng.Assert.assertEquals(this.receivedJobConfigs.size(), 2);
    org.testng.Assert.assertEquals(this.receivedJobConfigs.get(1).getProperty(gobblin.aws.AWSJobConfigurationManagerTest.JOB_NAME_KEY), gobblin.aws.AWSJobConfigurationManagerTest.JOB_SECOND_NAME);
    java.lang.System.out.println("testUpdatedNewJobConfigs END");
}