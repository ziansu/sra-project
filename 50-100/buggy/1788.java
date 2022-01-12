public void autoFillByName() {
    Model.DTO.BillItem bi = bm.getBillItemByName(productName.getText());
    if (bi != null) {
        unitPrice.setText(java.lang.Double.toString(bi.getUnitPrice()));
        productID.getSelectionModel().select(bi.getProductID());
    }else {
        unitPrice.clear();
        productID.getSelectionModel().clearSelection();
    }
}