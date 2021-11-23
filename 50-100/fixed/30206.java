public boolean putRequest(remote.controller.ButtonOrder c) {
    orderLock.lock();
    try {
        if (rightDirection(c)) {
            if ((c.direction) == (-1))
                downOrders.add(c);
            else
                upOrders.add(c);
            
            newOrder.signal();
            return true;
        }
        return false;
    } finally {
        orderLock.unlock();
    }
}