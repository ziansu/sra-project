@org.junit.Test
public void testProcessinitiatorManagerUserFilterTestWithStartFor() throws java.lang.Exception {
    loginOnDefaultTenantWith("processManager", "bpm");
    final org.bonitasoft.engine.bpm.process.ProcessInstance processInstance = getProcessAPI().startProcess(matti.getId(), definition.getId());
    waitForUserTask(processInstance, "step1");
    logoutOnTenant();
    checkAssignations();
}