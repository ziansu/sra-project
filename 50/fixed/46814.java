public void addColumnDefinition(ch.cern.impala.ogg.datapump.oracle.ColumnDefinition newColumnDefinition) {
    columns_list.add(newColumnDefinition);
    columns_map.put(newColumnDefinition.getName(), newColumnDefinition);
    ch.cern.impala.ogg.datapump.oracle.TableDefinition.LOG.info(("new column definition: " + newColumnDefinition));
}