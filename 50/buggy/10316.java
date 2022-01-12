public java.lang.String getDisplayName() {
    return (target.hasPermission(Job.BUILD)) && (this.target.isBuildable()) ? org.jenkinsci.plugins.schedulebuild.Messages.ScheduleBuildAction_DisplayName() : null;
}