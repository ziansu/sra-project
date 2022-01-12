@java.lang.Override
public java.lang.String getDisplayName() {
    return (target.hasPermission(Job.BUILD)) && (target.isBuildable()) ? org.jenkinsci.plugins.schedulebuild.Messages.ScheduleBuildAction_DisplayName() : null;
}