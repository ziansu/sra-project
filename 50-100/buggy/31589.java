@javafx.fxml.FXML
public void clear() {
    productID.setValue(null);
    unitPrice.clear();
    productName.clear();
    quantity.clear();
    total.clear();
    billNote.clear();
    productIDLbl.setText("");
    quantityLbl.setText("");
    LabeldateLbl.setText("");
}