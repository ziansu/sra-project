public void deploy(org.camunda.bpm.engine.impl.persistence.entity.DeploymentEntity deployment) {
    if (!(deployment.isNew())) {
        return ;
    }
    java.util.List<org.camunda.bpm.engine.impl.cmmn.entity.repository.CaseDefinitionEntity> deployedCaseDefinitions = deployment.getDeployedArtifacts(org.camunda.bpm.engine.impl.cmmn.entity.repository.CaseDefinitionEntity.class);
    for (org.camunda.bpm.engine.impl.cmmn.entity.repository.CaseDefinitionEntity caseDefinition : deployedCaseDefinitions) {
        java.lang.String predictionModelResourceName = (caseDefinition.getResourceName()) + ".json";
        org.camunda.bpm.engine.impl.persistence.entity.ResourceEntity predictionModel = deployment.getResource(predictionModelResourceName);
        if (predictionModel != null) {
            persistPredictionModel(predictionModel, caseDefinition);
        }
    }
}