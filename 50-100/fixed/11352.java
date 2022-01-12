private void generateMappingColumns(java.util.Map<model.data.DataColumn, java.lang.String> mappingNewNameToOldColumns) {
    for (java.util.Map.Entry<model.data.DataColumn, java.lang.String> entry : mappingNewNameToOldColumns.entrySet()) {
        model.data.DataColumn newColumn = new model.data.DataColumn(entry.getValue(), null, entry.getKey().getType());
        this.addColumn(newColumn);
        mappingColumns.put(entry.getKey(), newColumn);
    }
}