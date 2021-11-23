protected void execute(org.jboss.as.server.DeploymentProcessorTarget processorTarget) {
    org.jboss.as.webservices.dmr.WSDeploymentActivator.activate(processorTarget);
    processorTarget.addDeploymentProcessor(Phase.PARSE, Phase.PARSE_WEB_SERVICE_INJECTION_ANNOTATION, new org.jboss.as.webservices.webserviceref.WSRefAnnotationParsingProcessor());
}