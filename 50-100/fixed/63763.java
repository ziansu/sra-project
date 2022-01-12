public com.dell.cpsd.paqx.dne.service.LinkRepresentation createNextStepLink(final com.dell.cpsd.paqx.dne.domain.Job job, com.dell.cpsd.paqx.dne.service.WorkflowService workflowService) {
    final com.dell.cpsd.paqx.dne.service.Step nextStep = workflowService.findNextStep(job.getWorkflow(), job.getStep());
    final java.lang.String path = nextStep.getNextStep();
    final java.lang.String type = findTypeFromStep(nextStep.getNextStep());
    final java.lang.String method = findMethodFromStep(nextStep.getNextStep());
    final java.lang.String uriInfo = this.formatUri(job, path);
    return new com.dell.cpsd.paqx.dne.service.LinkRepresentation("step-next", uriInfo, type, method);
}