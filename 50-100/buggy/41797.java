private boolean IsDeploymentOfStatus(java.lang.String deploymentId, java.lang.String status) {
    com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest request = new com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest().withDeploymentIds(deploymentId);
    final com.amazonaws.services.opsworks.model.DescribeDeploymentsResult result = opsWorks.describeDeployments(request);
    for (com.amazonaws.services.opsworks.model.Deployment deployment : result.getDeployments()) {
        if (deployment.getStatus().equals(status)) {
            return false;
        }
    }
    return true;
}