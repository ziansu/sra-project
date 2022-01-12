private org.talend.components.api.component.Connector getConnector() {
    if ((myConnector) == null) {
        java.util.Set<? extends org.talend.components.api.component.Connector> connectors = getParentNode().getComponentProperties().getAvailableConnectors(null, true);
        for (org.talend.components.api.component.Connector connector : connectors) {
            if (connector.getName().equals(genericConnectorType)) {
                myConnector = connector;
                break;
            }
        }
    }
    return myConnector;
}