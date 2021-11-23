protected java.util.List<org.egov.infra.workflow.entity.StateHistory> setUpWorkFlowHistory(final java.lang.Long stateId) {
    final java.util.List<org.egov.infra.workflow.entity.StateHistory> workflowHisObj = inboxRenderServiceDeligate.getWorkflowHistory(stateId);
    if ((workflowBean) != null)
        workflowBean.setWorkFlowHistoryItems(workflowHisObj);
    
    return workflowHisObj;
}