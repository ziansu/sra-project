@org.testng.annotations.Test(groups = { "workflowmanager" }, dataProvider = "nonPersistedWorkflow", dataProviderClass = com.olympus.zeus.spring.dataprovider.WorkflowManagerDataProvider.class)
public void shouldGetAvailableActionIds(long callerId, java.lang.String workflowName, int initialActionId) {
    long workflowInstanceId = workflowManager.initialize(callerId, workflowName, initialActionId);
    int[] availableActionIds = workflowManager.getAvailableActionIds(callerId, workflowInstanceId);
    org.testng.Assert.assertEquals(availableActionIds.length, 1);
    org.testng.Assert.assertEquals(availableActionIds[0], 1);
}