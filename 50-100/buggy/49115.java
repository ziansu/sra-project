private org.apache.stratos.messaging.domain.instance.Instance getParentInstanceContext(java.lang.String parentInstanceId) {
    org.apache.stratos.messaging.domain.instance.Instance parentInstanceContext;
    org.apache.stratos.messaging.domain.applications.Application application = org.apache.stratos.autoscaler.applications.ApplicationHolder.getApplications().getApplication(this.appId);
    if (this.id.equals(appId)) {
        parentInstanceContext = application.getInstanceContexts(parentInstanceId);
    }else {
        org.apache.stratos.messaging.domain.applications.Group parentGroup = application.getGroupRecursively(this.parent.getId());
        parentInstanceContext = parentGroup.getInstanceContexts(parentInstanceId);
    }
    return parentInstanceContext;
}