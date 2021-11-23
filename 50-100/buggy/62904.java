public void takeOrder(core.agent.Message message) {
    core.restaurant.Order order = message.get(0);
    print((((((("Cooking an order of " + (order.getChoice())) + " for ") + (order.getCustomer().getName())) + " served by waiter ") + (order.getWaiter().getName())) + "."));
    synchronized(m_orders) {
        m_orders.add(order);
    }
    stateChanged();
}