private javafx.scene.control.TableColumn<java.lang.Integer, ?> setUpTableColumn(javafx.scene.control.TableColumn<java.lang.Integer, ?> tableColumn, int columnIndex, naga.core.ngui.displayresult.DisplayResult displayResult) {
    tableColumn.setText(naga.core.util.Strings.toString(displayResult.getHeaderValues()[columnIndex]));
    tableColumn.setGraphic(null);
    tableColumn.setCellValueFactory(( cdf) -> ((javafx.beans.value.ObservableValue) (displayResult.getValue(cdf.getValue(), columnIndex))));
    return tableColumn;
}