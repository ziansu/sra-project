private void buildTableAliasMap() {
    tableAliasMap = new java.util.HashMap<java.lang.String, java.lang.String>();
    tableAliasMap.put(cubeDesc.getFactTable().toUpperCase(), com.kylinolap.job.hadoop.hive.FACT_TABLE_ALIAS);
    int i = 1;
    for (com.kylinolap.cube.model.DimensionDesc dim : cubeDesc.getDimensions()) {
        com.kylinolap.job.hadoop.hive.JoinDesc join = dim.getJoin();
        if (join != null) {
            tableAliasMap.put(dim.getTable().toUpperCase(), ((LOOKUP_TABLE_ALAIS_PREFIX) + i));
            i++;
        }
    }
}