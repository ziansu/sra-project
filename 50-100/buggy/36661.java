@java.lang.Override
protected void execute(org.iobserve.adaption.data.AdaptationData element) throws java.lang.Exception {
    org.iobserve.adaption.data.AdaptationData adapdationData = new org.iobserve.adaption.data.AdaptationData();
    int result = org.iobserve.planning.CandidateCreation.EXEC_SUCCESS;
    if (result == (org.iobserve.planning.CandidateCreation.EXEC_ERROR)) {
        adapdationData.setReDeploymentURI(org.eclipse.emf.common.util.URI.createFileURI("C:\\GitRepositorys\\cocome\\cocome-cloud-jee-privacy\\EvalPCMModels\\SystemAdaptation\\AssemblyContextActionModel"));
    }else
        if (result == (org.iobserve.planning.CandidateCreation.EXEC_SUCCESS)) {
            adapdationData.setReDeploymentURI(org.eclipse.emf.common.util.URI.createFileURI("C:\\GitRepositorys\\cocome\\cocome-cloud-jee-privacy\\EvalPCMModels\\SystemAdaptation\\AssemblyContextActionModel"));
        }else {
            throw new java.lang.RuntimeException("PerOpteryx exited with unkown result/exec code");
        }
    
    org.iobserve.planning.CandidateInformations candidateInfos = new org.iobserve.planning.CandidateInformations();
    candidateInfos.adapdationData = adapdationData;
    this.outputPort.send(candidateInfos);
}