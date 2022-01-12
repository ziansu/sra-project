public void deleteButtonPushed() {
    javafx.collections.ObservableList<erp.PurchaseData> selectedRows;
    javafx.collections.ObservableList<erp.PurchaseData> allItems;
    allItems = PurchaseDataTable.getItems();
    selectedRows = PurchaseDataTable.getSelectionModel().getSelectedItems();
    for (erp.PurchaseData item : selectedRows) {
        allItems.remove(item);
        (count)--;
        int c = 1;
        for (erp.PurchaseData items : allItems) {
            items.setSerialNumber(c);
            c++;
        }
    }
}