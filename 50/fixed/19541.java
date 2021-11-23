public void changeTotalAmountCellEvent(javafx.scene.control.TableColumn.CellEditEvent editedCell) {
    erp.SalesData Selected = SalesDataTable.getSelectionModel().getSelectedItem();
    Selected.setTotalAmount(((java.lang.Integer) (editedCell.getNewValue())));
}