@java.lang.Override
public org.talend.daikon.runtime.RuntimeInfo getRuntimeInfo(org.talend.components.api.component.runtime.ExecutionEngine engine, org.talend.components.api.properties.ComponentProperties properties, org.talend.components.api.component.ConnectorTopology connectorTopology) {
    assertEngineCompatibility(engine);
    assertConnectorTopologyCompatibility(connectorTopology);
    return getCommonRuntimeInfo(org.talend.components.marketo.tmarketobulkexec.RUNTIME_SOURCE_CLASS);
}