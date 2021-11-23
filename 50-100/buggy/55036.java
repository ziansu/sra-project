public org.talend.components.api.component.Connector getComponentConnector() {
    java.util.Set<? extends org.talend.components.api.component.Connector> connectors = getParentNode().getComponentProperties().getPossibleConnectors(output);
    if (connectors != null) {
        for (org.talend.components.api.component.Connector connector : connectors) {
            if (connector.getName().equals(genericConnectorType)) {
                return connector;
            }
        }
    }
    return null;
}