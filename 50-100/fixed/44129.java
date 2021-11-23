public boolean start() {
    if (this.running) {
        return false;
    }
    if (!(sendStart())) {
        return false;
    }
    this.simulationThread = new java.lang.Thread(this);
    this.simulationThread.start();
    this.running = true;
    if (((this.getType()) == "car") && ((this.getStartPoint()) == (-1))) {
        return false;
    }
    return true;
}