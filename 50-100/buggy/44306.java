public java.lang.String process() throws org.imixs.workflow.exceptions.ModelException, org.imixs.workflow.exceptions.PluginException {
    if ((workitem) == null) {
        org.imixs.workflow.faces.workitem.WorkflowController.logger.warning("Unable to process workitem == null!");
        return null;
    }
    workitem.replaceItemValue("action", "");
    workitem = this.getWorkflowService().processWorkItem(workitem);
    java.lang.String action = workitem.getItemValueString("action");
    if ("".equals(action))
        action = workitem.getItemValueString("txtworkflowresultmessage");
    
    return "".equals(action) ? null : action;
}