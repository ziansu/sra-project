@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(this, "Pedido cancelado", Toast.LENGTH_SHORT).show();
    if (readOnly) {
        firebaseRealtimeDatabaseHelperOrders.delete(order);
        removeNotification(com.cynerds.cyburger.activities.MainActivity.ORDERS_TAB, 1);
    }else {
        previousOrder = new com.cynerds.cyburger.models.orders.Order();
    }
    badge.setBadgeCount(0);
    order = new com.cynerds.cyburger.models.orders.Order();
    dialogManager.closeDialog();
}