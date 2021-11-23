@org.junit.Test
public void testProcessSimple() throws org.imixs.workflow.exceptions.AccessDeniedException, org.imixs.workflow.exceptions.PluginException, org.imixs.workflow.exceptions.ProcessingErrorException {
    org.imixs.workflow.ItemCollection workitem = database.get("W0000-00001");
    workitem.replaceItemValue(WorkflowKernel.MODELVERSION, org.imixs.workflow.engine.TestWorkflowService.DEFAULT_MODEL_VERSION);
    workitem.replaceItemValue(WorkflowKernel.PROCESSID, 100);
    workitem.replaceItemValue(WorkflowKernel.ACTIVITYID, 10);
    workitem = workflowService.processWorkItem(workitem);
    junit.framework.Assert.assertEquals("1.0.0", workitem.getItemValueString("$ModelVersion"));
}