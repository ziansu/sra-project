public void placeOrder() {
    java.lang.System.out.println("Place Order Pressed");
    dbMan.init();
    java.lang.System.out.println(("RowID = " + (dbMan.customerSelect("SELECT rowid, * FROM CUSTOMERS;"))));
    model.clear();
    tabMain.setSelectedIndex(1);
    initOrders();
}