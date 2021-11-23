@java.lang.Override
public void addOrderButtonClicked() {
    ORDER_IS_ACTIVE = true;
    orders.add(0, new com.example.clevercafe.model.Order(((orders.size()) + 1), new java.util.ArrayList<>()));
    mainView.showOrders(orders);
}