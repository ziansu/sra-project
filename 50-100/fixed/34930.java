public org.activiti.engine.repository.ProcessDefinition findProcDef(com.studerw.activiti.model.document.DocType docType, java.lang.String group) {
    org.activiti.engine.repository.ProcessDefinition pd = this.findProcDefByDocTypeAndGroup(docType, group);
    if (pd == null) {
        com.studerw.activiti.workflow.WorkflowService.log.debug("no group workflow exists of doctype={} and group={} -> checking for base wf.", docType.name(), group);
        pd = this.findBaseProcDef(docType);
    }
    return pd;
}