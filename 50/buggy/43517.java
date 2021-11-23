@java.lang.Override
public java.lang.String getUrlName() {
    return jenkins.model.Jenkins.getInstance().hasPermission(getRequiredPermissionForRunScript()) ? "scriptler" : null;
}