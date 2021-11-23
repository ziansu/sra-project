private void updateTable(boolean showAll) {
    products.removeAll();
    products = null;
    products = javafx.collections.FXCollections.observableArrayList();
    tableView_products.getColumns().removeAll(idCol, nameCol, subnameCol, barcodeCol, categoryCol, priceCol, locationCol, quantityCol, contractorIdCol);
    retrieveData();
    runWarehouseCheck(true);
    if (showsAll) {
        updateColumns(products);
    }else {
        updateColumns(almostEmptyStorages);
    }
    updateStats();
}