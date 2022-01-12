public void run() throws java.lang.Exception {
    com.google.common.base.Preconditions.checkState(((this.state.get()) == (State.INITED)), ("Can only run while in INITED state. Current: " + (this.state)));
    this.state.set(State.RUNNING);
    processor.run(runInputMap, runOutputMap);
}