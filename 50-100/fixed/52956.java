@org.junit.Test
public void assertJobsBundleIsWorking() {
    org.mockito.Mockito.when(environment.lifecycle()).thenReturn(applicationContext);
    new de.spinscale.dropwizard.jobs.JobsBundle().run(environment);
    final org.mockito.ArgumentCaptor<de.spinscale.dropwizard.jobs.JobManager> jobManagerCaptor = org.mockito.ArgumentCaptor.forClass(de.spinscale.dropwizard.jobs.JobManager.class);
    org.mockito.Mockito.verify(applicationContext).manage(jobManagerCaptor.capture());
    de.spinscale.dropwizard.jobs.JobManager jobManager = jobManagerCaptor.getValue();
    org.hamcrest.MatcherAssert.assertThat(jobManager, org.hamcrest.Matchers.is(org.hamcrest.Matchers.notNullValue()));
}