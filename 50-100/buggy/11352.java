private void generateMappingColumns(java.util.Map<java.lang.String, model.data.DataColumn> mappingNewNameToOldColumns) {
    for (java.util.Map.Entry<java.lang.String, model.data.DataColumn> entry : mappingNewNameToOldColumns.entrySet()) {
        model.data.DataColumn newColumn = new model.data.DataColumn(entry.getKey(), null, entry.getValue().getType());
        this.addColumn(newColumn);
        mappingColumns.put(entry.getValue(), newColumn);
    }
}