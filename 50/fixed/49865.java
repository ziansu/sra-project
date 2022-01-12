public void startRun() {
    synchronized(this) {
        Strategy.logger.info(("STARTED" + (this.runFlag)));
        this.runFlag = true;
    }
}