public org.activiti.engine.repository.ProcessDefinition findProcDef(com.studerw.activiti.model.document.DocType docType, java.lang.String group) {
    com.studerw.activiti.workflow.WorkflowService.log.debug("Checking for workflow exists of doctype={} and group={}", docType.name(), group);
    org.activiti.engine.repository.ProcessDefinition pd = this.findProcDefByDocTypeAndGroup(docType, group);
    if (pd == null) {
        com.studerw.activiti.workflow.WorkflowService.log.debug("no group workflow exists of doctype={} and group={} -> checking for base wf.", docType.name(), group);
        pd = this.findBaseProcDef(docType);
    }
    return pd;
}