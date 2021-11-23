public synchronized float get(int processor, int channel) {
    while (!(available)) {
        try {
            wait();
        } catch (java.lang.InterruptedException e) {
        }
    } 
    if (((targetProcessor) == processor) && ((this.channel) == channel)) {
        available = false;
        notifyAll();
        return data;
    }
    return -1;
}