protected void setTableData(javafx.scene.control.TableView tableView, java.lang.Number[][] data, java.lang.String rowHeader, java.lang.String columnHeader, de.oth.hsp.common.utils.Decimals decimals) {
    tableView.getItems().clear();
    tableView.getColumns().clear();
    addColumnWithRowNumber(tableView, rowHeader);
    addTableViewContent(data, tableView, decimals, columnHeader);
}