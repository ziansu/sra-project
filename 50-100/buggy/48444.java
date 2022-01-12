public void startDependencyOnTermination(java.lang.String parentInstanceId) throws org.apache.stratos.autoscaler.exception.application.TopologyInConsistentException {
    java.util.List<org.apache.stratos.autoscaler.applications.dependency.context.ApplicationChildContext> applicationContexts = this.startupDependencyTree.getStarAbleDependenciesByTermination();
    for (org.apache.stratos.autoscaler.applications.dependency.context.ApplicationChildContext context : applicationContexts) {
        if (context instanceof org.apache.stratos.autoscaler.applications.dependency.context.GroupChildContext) {
            org.apache.stratos.autoscaler.monitor.component.GroupMonitor groupMonitor = ((org.apache.stratos.autoscaler.monitor.component.GroupMonitor) (this.aliasToActiveMonitorsMap.get(context.getId())));
        }else
            if (context instanceof org.apache.stratos.autoscaler.applications.dependency.context.ClusterChildContext) {
            }
        
    }
}