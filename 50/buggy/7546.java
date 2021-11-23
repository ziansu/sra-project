@java.lang.Override
public java.util.Set<org.talend.components.api.component.ConnectorTopology> getSupportedConnectorTopologies() {
    return java.util.EnumSet.of(ConnectorTopology.INCOMING, ConnectorTopology.OUTGOING, ConnectorTopology.NONE, ConnectorTopology.INCOMING_AND_OUTGOING);
}