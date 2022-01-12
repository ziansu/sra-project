@org.junit.Test
public void testAutoSchedule() throws java.lang.Exception {
    java.io.File src = new java.io.File(java.lang.Thread.currentThread().getContextClassLoader().getResource("com/collective/celos/client/wf-list").toURI());
    org.apache.commons.io.FileUtils.copyDirectory(src, workflowsDir);
    com.collective.celos.server.Main.setupAutoschedule(java.util.Arrays.asList(port), 1);
    org.junit.Assert.assertTrue(autoScheduleWorked());
}