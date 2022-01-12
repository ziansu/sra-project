@org.junit.Test
public void startNotStarted() throws java.io.IOException {
    java.lang.String applicationName = getApplicationName();
    org.cloudfoundry.operations.ApplicationsTest.createApplication(this.cloudFoundryOperations, org.cloudfoundry.operations.ApplicationsTest.getApplicationBits(), applicationName, false).then(this.cloudFoundryOperations.applications().start(org.cloudfoundry.operations.applications.StartApplicationRequest.builder().name(applicationName).build())).subscribe(testSubscriber());
}