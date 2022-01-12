@java.lang.Override
public java.lang.String getIconFileName() {
    return (target.hasPermission(Job.BUILD)) && (target.isBuildable()) ? "/plugin/schedule-build/images/schedule.png" : null;
}