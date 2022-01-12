public synchronized void put(float x, int targetProcessor, int channel) {
    while (available) {
        try {
            wait();
        } catch (java.lang.InterruptedException e) {
        }
    } 
    data[1] = x;
    available = true;
    this.channel = channel;
    this.targetProcessor = targetProcessor;
    notifyAll();
}