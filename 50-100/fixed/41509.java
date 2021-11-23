public void transitToReceiver(int time, physicalInternet.Receiver receiver) {
    for (java.util.Iterator<physicalInternet.Order> iterator = physicalInternet.Transit.ordersToReceiver.iterator(); iterator.hasNext();) {
        physicalInternet.Order order = iterator.next();
        if ((((order.getTimeOfOrder()) + (physicalInternet.Transit.transitTime)) + 1) == time) {
            sendOrderToReceiver(order, receiver);
            iterator.remove();
        }
    }
}