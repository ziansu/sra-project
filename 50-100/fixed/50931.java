public ch.cern.impala.ogg.datapump.impala.descriptors.StagingTableDescriptor getDefinitionForStagingTable() {
    ch.cern.impala.ogg.datapump.impala.descriptors.StagingTableDescriptor stagingTableDef = new ch.cern.impala.ogg.datapump.impala.descriptors.StagingTableDescriptor(schemaName, tableName.concat("_staging"));
    for (ch.cern.impala.ogg.datapump.impala.descriptors.ColumnDescriptor colDef : columns_list) {
        if (!(colDef instanceof ch.cern.impala.ogg.datapump.impala.descriptors.PartitioningColumnDescriptor)) {
            stagingTableDef.addColumnDescriptor(new ch.cern.impala.ogg.datapump.impala.descriptors.ColumnDescriptor(colDef.getName(), "STRING", null));
        }
    }
    return stagingTableDef;
}