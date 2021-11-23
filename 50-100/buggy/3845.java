@org.junit.Before
public void setUp() {
    connector = derbyConnectorRule.getConnector();
    tablesConfig = derbyConnectorRule.metadataTablesConfigSupplier().get();
    connector.createAuditTable();
    auditManager = new io.druid.server.audit.SQLAuditManager(connector, com.google.common.base.Suppliers.ofInstance(tablesConfig), new io.druid.server.metrics.NoopServiceEmitter(), mapper, new io.druid.server.audit.SQLAuditManagerConfig());
    connector.createRulesTable();
    ruleManager = new io.druid.metadata.SQLMetadataRuleManager(mapper, com.google.common.base.Suppliers.ofInstance(new io.druid.metadata.MetadataRuleManagerConfig()), com.google.common.base.Suppliers.ofInstance(tablesConfig), connector, auditManager);
}