public void autoFillByName() {
    java.lang.String id = bm.getBillItemByName(productName.getText());
    if (id != null) {
        productID.getSelectionModel().select(id);
    }else {
        unitPrice.clear();
        productID.getSelectionModel().clearSelection();
    }
}