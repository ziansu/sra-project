public org.ihtsdo.rvf.execution.service.impl.ExecutionConfig createExecutionConfig(org.ihtsdo.rvf.execution.service.impl.ValidationRunConfig validationConfig) {
    org.ihtsdo.rvf.execution.service.impl.ExecutionConfig executionConfig = new org.ihtsdo.rvf.execution.service.impl.ExecutionConfig(validationConfig.getRunId(), validationConfig.isFirstTimeRelease());
    executionConfig.setGroupNames(validationConfig.getGroupsList());
    executionConfig.setExtensionValidation(isExtension(validationConfig));
    executionConfig.setFailureExportMax(10);
    if ((validationConfig.getFailureExportMax()) != null) {
        executionConfig.setFailureExportMax(validationConfig.getFailureExportMax());
    }
    return executionConfig;
}