@org.junit.Test
public void testCallExtensionPoint() throws java.lang.Exception {
    org.pentaho.metaverse.analyzer.kettle.extensionpoints.job.JobLineageHolderMap originalHolderMap = mockBuilder();
    jobExtensionPoint.callExtensionPoint(null, job);
    java.util.List<org.pentaho.di.job.JobListener> listeners = job.getJobListeners();
    assertNotNull(listeners);
    assertTrue(listeners.contains(jobExtensionPoint));
    org.pentaho.metaverse.analyzer.kettle.extensionpoints.job.JobLineageHolderMap.setInstance(originalHolderMap);
}