public void addConsumer() {
    synchronized(this) {
        (this.totalConsumers)++;
    }
}