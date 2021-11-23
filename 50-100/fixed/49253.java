@java.lang.Override
public com.orientechnologies.orient.server.hazelcast.DB_STATUS getDatabaseStatus(final java.lang.String iNode, final java.lang.String iDatabaseName) {
    final com.orientechnologies.orient.server.hazelcast.DB_STATUS status = ((com.orientechnologies.orient.server.hazelcast.DB_STATUS) (getConfigurationMap().get(((((com.orientechnologies.orient.server.hazelcast.OHazelcastPlugin.CONFIG_DBSTATUS_PREFIX) + iNode) + ".") + iDatabaseName))));
    return status != null ? status : DB_STATUS.OFFLINE;
}