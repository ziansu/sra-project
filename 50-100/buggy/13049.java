@org.junit.Test
public void restartNotStarted() throws java.io.IOException {
    java.lang.String applicationName = getApplicationName();
    org.cloudfoundry.operations.ApplicationsTest.createApplication(this.cloudFoundryOperations, org.cloudfoundry.operations.ApplicationsTest.getApplicationBits(), applicationName, false).then(this.cloudFoundryOperations.applications().restart(org.cloudfoundry.operations.applications.RestartApplicationRequest.builder().name(applicationName).build())).subscribe(testSubscriber());
}