public boolean hasConnector(java.lang.String connectorName, pcbuilder.domain.CType type) {
    for (pcbuilder.domain.Connector connector : connectors) {
        if ((connector.getName().equals(connectorName)) && (connector.getType().name().equals(type.name())))
            return true;
        
    }
    return false;
}