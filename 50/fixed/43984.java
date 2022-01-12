@org.junit.Test
public void canGetJobKillServiceBean() {
    org.junit.Assert.assertNotNull(this.servicesConfig.jobKillService("localhost", this.jobSearchService, org.mockito.Mockito.mock(org.apache.commons.exec.Executor.class), true));
}