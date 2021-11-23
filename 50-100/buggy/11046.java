private void deployProcess() throws java.io.IOException, java.security.NoSuchAlgorithmException {
    java.lang.String processDefinitionKey = "liquidPoc";
    java.lang.String definitionClasspath = "processes/liquid.consignment.1.bpmn20.xml";
    org.activiti.engine.RepositoryService repositoryService = processEngine.getRepositoryService();
    org.activiti.engine.repository.ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionKey(processDefinitionKey).latestVersion().singleResult();
    if (null == processDefinition)
        repositoryService.createDeployment().addClasspathResource(definitionClasspath).deploy();
    
}