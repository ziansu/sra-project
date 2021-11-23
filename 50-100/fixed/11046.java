private void deployProcess() {
    org.activiti.engine.RepositoryService repositoryService = processEngine.getRepositoryService();
    org.activiti.engine.repository.ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionKey(processDefinitionKey).latestVersion().singleResult();
    if (null == processDefinition)
        repositoryService.createDeployment().addClasspathResource(definitionClasspath).deploy();
    
}