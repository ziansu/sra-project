@java.lang.Override
public org.apache.drill.exec.planner.logical.CreateTableEntry createStatsTable(java.lang.String tableName) {
    org.apache.drill.exec.store.dfs.WorkspaceSchemaFactory.ensureNotStatsTable(tableName);
    final java.lang.String statsTableName = getStatsTableName(tableName);
    org.apache.drill.exec.store.dfs.FormatPlugin formatPlugin = plugin.getFormatPlugin(JSONFormatPlugin.DEFAULT_NAME);
    return createOrAppendToTable(statsTableName, false, formatPlugin, com.google.common.collect.ImmutableList.<java.lang.String>of());
}