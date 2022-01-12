public boolean hasConnector(java.lang.String connectorName, pcbuilder.domain.CType type) {
    for (pcbuilder.domain.Connector connector : connectors) {
        if (((connector.getName()) == connectorName) && ((connector.getType()) == type))
            return true;
        
    }
    return false;
}