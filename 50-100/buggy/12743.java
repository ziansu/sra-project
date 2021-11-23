public void run() throws java.lang.Exception {
    synchronized(this.state) {
        com.google.common.base.Preconditions.checkState(((this.state) == (State.INITED)), ("Can only run while in INITED state. Current: " + (this.state)));
        this.state = State.RUNNING;
    }
    processor.run(runInputMap, runOutputMap);
}