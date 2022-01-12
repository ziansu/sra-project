@java.lang.Override
protected void onResume() {
    super.onResume();
    int orderId = getIntent().getIntExtra(OrderStatusNotification.ORDER_ID, (-1));
    java.lang.System.out.println(("Intent with order ID " + orderId));
    if (orderId != (-1))
        navTo(new activity.OrderDetailFragment().setOrder(new model.Order(orderId)));
    
}