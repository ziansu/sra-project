public void DisplayPurchaseOrderList() {
    JDBC jdbc = new JDBC();
    jdbc.readPurchaseOrderLine();
    javax.swing.DefaultListModel<java.lang.String> listModel = ((javax.swing.DefaultListModel<java.lang.String>) (list.getModel()));
    listModel.clear();
    for (java.lang.String productString : jdbc.readPurchaseOrder()) {
        listModel.addElement(productString);
    }
}