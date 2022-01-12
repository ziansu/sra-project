public boolean putRequest(remote.controller.ButtonOrder c) {
    orderLock.lock();
    if (rightDirection(c)) {
        try {
            if ((c.direction) == (-1))
                downOrders.add(c);
            else
                upOrders.add(c);
            
            newOrder.signal();
        } finally {
            orderLock.unlock();
        }
        return true;
    }
    return false;
}