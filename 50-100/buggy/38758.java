private void fillJobParameters() {
    java.util.Map<java.lang.String, java.lang.String> reletedProperties = org.jenkins.plugin.templateWorkflows.TemplateWorkflowUtil.getTemplateParamaters(templateName);
    java.util.Map<java.lang.String, java.lang.String> newJobParameters = getJobParameters();
    newJobParameters.clear();
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : reletedProperties.entrySet()) {
        newJobParameters.put(entry.getKey(), jobRelation.get(entry.getKey()));
    }
    jobParameters = newJobParameters;
}