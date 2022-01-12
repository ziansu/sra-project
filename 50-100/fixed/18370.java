public java.util.List<com.example.phill.bechvinapp.Model.Order> getAllOrders() {
    java.util.List<com.example.phill.bechvinapp.Model.Order> orders = null;
    odc.open();
    odc.beginTransaction();
    orders = odc.getAllOrders();
    odc.endTransaction();
    odc.close();
    return orders;
}