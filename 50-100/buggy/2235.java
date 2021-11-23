public void setConnection(org.jboss.tools.openshift.core.connection.Connection connection, boolean executeCommand) {
    org.jboss.tools.openshift.core.connection.Connection previous = getConnection();
    java.lang.String previousUrl = (previous == null) ? null : getConnectionUrl(previous);
    java.lang.String newUrl = (connection == null) ? null : getConnectionUrl(connection);
    super.setConnection(connection);
    if (executeCommand)
        section.execute(new org.jboss.tools.openshift.internal.ui.server.OpenShiftServerEditorModel.SetConnectionCommand(getServer(), previous, connection, newUrl));
    
}