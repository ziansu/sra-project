@org.testng.annotations.Test
public void shouldUpdateJobInfoInConstructor() {
    final de.otto.edison.jobs.monitor.JobMonitor monitor = org.mockito.Mockito.mock(de.otto.edison.jobs.monitor.JobMonitor.class);
    final de.otto.edison.jobs.domain.JobInfo jobInfo = de.otto.edison.jobs.domain.JobInfo.newJobInfo(java.net.URI.create("foo"), "TEST", monitor, java.time.Clock.systemDefaultZone());
    org.mockito.Mockito.verify(monitor).update(jobInfo);
}