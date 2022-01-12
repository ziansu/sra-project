@org.junit.Test
public void testStop() throws java.lang.Exception {
    org.easymock.EasyMock.expect(taskMaster.getTaskRunner()).andReturn(com.google.common.base.Optional.of(taskRunner)).anyTimes();
    taskClient.close();
    taskRunner.unregisterListener(java.lang.String.format("JDBCSupervisor-%s", io.druid.indexing.jdbc.supervisor.JDBCSupervisorTest.DATASOURCE));
    replayAll();
    supervisor = getSupervisor(1, 1, "PT1H", null);
    supervisor.start();
    supervisor.stop(false);
    verifyAll();
}