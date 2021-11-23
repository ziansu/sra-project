synchronized int dispense(int cid) throws java.lang.InterruptedException {
    while (((currNum) == (max)) && (orders.keySet().contains(nextNum())))
        wait();
    
    int ticketNum = currNum;
    orders.put(ticketNum, new Bakery.Order(cid));
    callQueue.add(ticketNum);
    be.logTake(cid, ticketNum);
    currNum = nextNum();
    notifyAll();
    return ticketNum;
}