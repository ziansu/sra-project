@org.junit.Test
public void testProcessInitiatorUserFilterTestWithStartFor() throws java.lang.Exception {
    loginOnDefaultTenantWith("processManager", "bpm");
    final org.bonitasoft.engine.bpm.process.ProcessInstance processInstance = getProcessAPI().startProcess(matti.getId(), definition.getId());
    waitForUserTask("step1", processInstance);
    checkAssignations();
}