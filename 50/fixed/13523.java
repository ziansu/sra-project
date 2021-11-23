public org.onosproject.ui.table.TableModel.Row cell(java.lang.String columnId, java.lang.Object value) {
    checkId(columnId);
    cells.put(columnId, value);
    return this;
}