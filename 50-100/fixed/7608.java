public void updateDeploymentPolicyInInformationModel(org.apache.stratos.autoscaler.pojo.policy.deployment.DeploymentPolicy deploymentPolicy) throws org.apache.stratos.autoscaler.exception.policy.InvalidPolicyException {
    if (org.apache.stratos.autoscaler.pojo.policy.PolicyManager.deploymentPolicyListMap.containsKey(deploymentPolicy.getDeploymentPolicyID())) {
        if (org.apache.stratos.autoscaler.pojo.policy.PolicyManager.log.isDebugEnabled()) {
            org.apache.stratos.autoscaler.pojo.policy.PolicyManager.log.debug(("Updating deployment policy: " + (deploymentPolicy.getDeploymentPolicyID())));
        }
        org.apache.stratos.autoscaler.pojo.policy.PolicyManager.deploymentPolicyListMap.put(deploymentPolicy.getDeploymentPolicyID(), deploymentPolicy);
    }
}