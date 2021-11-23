public synchronized boolean removeAllOrders(java.lang.String playerID) {
    uk.ac.cam.teamOscarSSE.Map<java.lang.Long, uk.ac.cam.teamOscarSSE.Order> pending_orders = getPendingOrders(playerID);
    boolean good = true;
    for (uk.ac.cam.teamOscarSSE.Map.Entry<java.lang.Long, uk.ac.cam.teamOscarSSE.Order> entry : pending_orders.entrySet()) {
        if (!(removeOrder(entry.getKey()))) {
            good = false;
        }
    }
    return good;
}