public void editInactiveExecutionPlan(java.lang.String executionPlan, java.lang.String filename) throws org.wso2.carbon.event.processor.core.exception.ExecutionPlanConfigurationException, org.wso2.carbon.event.processor.core.exception.ExecutionPlanDependencyValidationException {
    validateFilePath(filename);
    org.wso2.carbon.event.processor.core.internal.util.helper.EventProcessorHelper.validateExecutionPlan(executionPlan);
    org.wso2.carbon.event.processor.core.ExecutionPlan parsedExecutionPlan = org.wso2.siddhi.query.compiler.SiddhiCompiler.parse(executionPlan);
    java.lang.String newExecutionPlanName = org.wso2.siddhi.query.api.util.AnnotationHelper.getAnnotationElement(EventProcessorConstants.ANNOTATION_NAME_NAME, null, parsedExecutionPlan.getAnnotations()).getValue();
    org.wso2.carbon.event.processor.core.internal.util.EventProcessorConfigurationFilesystemInvoker.delete(filename);
    org.wso2.carbon.event.processor.core.internal.util.EventProcessorConfigurationFilesystemInvoker.save(executionPlan, newExecutionPlanName, filename);
}