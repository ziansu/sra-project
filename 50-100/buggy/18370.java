public java.util.List<com.example.phill.bechvinapp.Model.Order> getAllOrders() {
    java.util.List<com.example.phill.bechvinapp.Model.Order> orders = null;
    try {
        odc.open();
        odc.beginTransaction();
        orders = odc.getAllOrders();
    } catch (java.lang.Exception e) {
        android.util.Log.e("BechWineApp", (((e.getMessage()) + "\n") + (stackTraceToString(e))));
    } finally {
        odc.endTransaction();
        odc.close();
    }
    return orders;
}