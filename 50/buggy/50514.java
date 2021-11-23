private boolean validateTable(org.apache.cassandra.thrift.KsDef ksDef, java.lang.String tableName) {
    if ((getCfDef(ksDef, tableName)) == null) {
        com.rayo.storage.cassandra.CassandraSchemaHandler.log.debug("Table %s not found. Schema will be recreated");
        return false;
    }
    return true;
}