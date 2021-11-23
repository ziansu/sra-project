private java.util.List<org.bonitasoft.engine.core.process.definition.model.SConnectorDefinition> getConnectorList() {
    final org.bonitasoft.engine.core.process.definition.model.SConnectorDefinition connector1 = org.mockito.Mockito.mock(org.bonitasoft.engine.core.process.definition.model.SConnectorDefinition.class);
    final org.bonitasoft.engine.core.process.definition.model.SConnectorDefinition connector2 = org.mockito.Mockito.mock(org.bonitasoft.engine.core.process.definition.model.SConnectorDefinition.class);
    final java.util.List<org.bonitasoft.engine.core.process.definition.model.SConnectorDefinition> connectors = new java.util.ArrayList<org.bonitasoft.engine.core.process.definition.model.SConnectorDefinition>(2);
    connectors.add(connector1);
    connectors.add(connector2);
    return connectors;
}