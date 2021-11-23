@org.junit.Test
public void testProcessInitiatorUserFilterTest() throws java.lang.Exception {
    loginOnDefaultTenantWith("matti", "bpm");
    final org.bonitasoft.engine.bpm.process.ProcessInstance processInstance = getProcessAPI().startProcess(definition.getId());
    waitForUserTask(processInstance, "step1");
    checkAssignations();
}