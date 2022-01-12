private void processOrderMessage(final com.jforex.programming.order.OrderUpdateEventData orderUpdateEventData, final com.jforex.programming.order.OrderUpdateEvent orderUpdateEvent) {
    printOrderUpdate(orderUpdateEventData);
    if (orderUpdateEventHandlers.containsKey(orderUpdateEvent))
        orderUpdateEventHandlers.get(orderUpdateEvent).run();
    
}