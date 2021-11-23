@java.lang.Override
public void start() throws java.lang.Exception {
    connector.createRulesTable();
    io.druid.metadata.SQLMetadataRuleManager.createDefaultRule(dbi, dbTables.get().getRulesTable(), config.get().getDefaultRule(), jsonMapper);
}