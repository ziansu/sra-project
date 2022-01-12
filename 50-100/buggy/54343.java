@java.lang.Override
public void execute(org.activiti.engine.delegate.DelegateExecution execution) throws java.lang.Exception {
    java.lang.String authenticatedUserName = org.alfresco.repo.security.authentication.AuthenticationUtil.getFullyAuthenticatedUser();
    rs.make.alfresco.workflow.activiti.delegate.newsflash.SetParametersForNewsFlash.logger.debug(java.lang.String.format(("Authenticated user: %s, Process instance Id: %s, activity: %s." + authenticatedUserName), execution.getProcessInstanceId(), execution.getCurrentActivityName()));
    org.alfresco.repo.security.authentication.AuthenticationUtil.setRunAsUserSystem();
    java.util.Map<java.lang.String, java.lang.Object> workflowVars = new java.util.HashMap<java.lang.String, java.lang.Object>();
    workflowVars.put("initiatorUserName", authenticatedUserName);
    makeWorkflowVars.setExecutionLocalVars(execution, workflowVars);
    setExecutorsVars(execution);
    org.alfresco.repo.security.authentication.AuthenticationUtil.setRunAsUser(authenticatedUserName);
}