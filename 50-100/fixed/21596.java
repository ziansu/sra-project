public synchronized void put(logicalclock.Message message) {
    while ((numItems) == (CAPACITY)) {
        try {
            wait();
            java.lang.System.out.println("Buffer is full. Waiting ....");
        } catch (java.lang.InterruptedException e) {
        }
    } 
    (numItems)++;
    this.messages[front] = new logicalclock.Message(message);
    front = ((front) + 1) % (CAPACITY);
    notifyAll();
}