private void generateMappingCombinedCollumns() {
    for (java.util.Map.Entry<model.data.DataColumn, model.data.DataColumn> entry : combineColumns.entrySet()) {
        if (mappingColumns.containsKey(entry.getValue())) {
            mappingColumns.put(entry.getKey(), mappingColumns.get(entry.getValue()));
        }
    }
}