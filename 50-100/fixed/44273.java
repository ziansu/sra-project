public boolean deleteRowHaving(java.lang.String keyspace, java.lang.String havingTable, com.datastax.driver.core.Row preagRow) {
    java.util.List<com.datastax.driver.core.ColumnDefinitions.Definition> def = preagRow.getColumnDefinitions().asList();
    java.lang.String pkName = def.get(0).getName();
    java.lang.String pkType = def.get(0).getType().toString();
    java.lang.String pkVAlue = ViewManager.Utils.getColumnValueFromDeltaStream(preagRow, pkName, pkType, "");
    ViewManager.Utils.deleteEntireRowWithPK(keyspace, havingTable, pkName, pkVAlue);
    return true;
}