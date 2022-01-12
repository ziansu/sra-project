public void step(double time, double delta) {
    this.consumeMessages();
    synchronized(msgBox) {
        this.msgBox.clear();
    }
    this.dt(time, delta);
}