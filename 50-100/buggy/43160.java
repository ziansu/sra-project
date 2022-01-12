public com.atlassian.plugins.proteus.jira.issue.view.util.IssueInfo setActivityRcd(java.util.List<com.atlassian.plugins.proteus.jira.issue.view.util.DeploymentActivityRecord> activityRcd) {
    this.activityRcd = activityRcd;
    java.util.Collections.sort(this.activityRcd);
    com.atlassian.plugins.proteus.jira.issue.view.util.DeploymentActivityRecord lastDep = this.getLastDeploymentToEnv(null);
    java.util.Map.Entry<java.lang.String, java.lang.String> oneComp = lastDep.getComponentVersionMap().entrySet().iterator().next();
    this.deployedComponent = oneComp.getKey();
    this.deployedVersion = oneComp.getValue();
    return this;
}