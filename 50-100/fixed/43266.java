@java.lang.Override
public void truncate() {
    try {
        conns.get().executeUnregisteredQuery(("TRUNCATE TABLE " + (oracleTableNameGetter.getInternalShortTableName(conns, tableRef))));
    } catch (com.palantir.atlasdb.keyvalue.impl.TableMappingNotFoundException | java.lang.RuntimeException e) {
        throw new java.lang.IllegalStateException(java.lang.String.format("Truncate called on a table (%s) that did not exist", oracleTableNameGetter.getPrefixedTableName(tableRef)), e);
    }
    truncateOverflowTableIfItExists();
}