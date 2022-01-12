public void setColumns(java.util.List<org.activityinfo.ui.client.component.table.FieldColumn> columns) {
    removeAllColumns();
    this.dataLoader.reset();
    this.columns = com.google.common.collect.Lists.newArrayList(columns);
    for (org.activityinfo.ui.client.component.table.FieldColumn column : columns) {
        final org.activityinfo.ui.client.component.table.filter.FilterCellAction filterAction = new org.activityinfo.ui.client.component.table.filter.FilterCellAction(this, column);
        table.addColumn(column, new org.activityinfo.ui.client.component.table.filter.FilterHeader(column, filterAction));
    }
    reload();
    table.saveColumnWidthInformation();
}