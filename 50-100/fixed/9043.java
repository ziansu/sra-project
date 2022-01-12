@org.junit.Test
public void testRuntimeDisabled() throws java.lang.Exception {
    jobExtensionPoint.setRuntimeEnabled(false);
    jobExtensionPoint.callExtensionPoint(null, job);
    java.util.List<org.pentaho.di.job.JobListener> listeners = job.getJobListeners();
    assertNotNull(listeners);
    assertFalse(listeners.contains(jobExtensionPoint));
}