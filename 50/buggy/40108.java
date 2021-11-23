@java.lang.Override
public org.kframework.debugger.DebuggerState resume() {
    org.kframework.kore.K previousK;
    do {
        previousK = activeState.getCurrentK();
        step(checkpointInterval);
    } while (previousK != (activeState.getCurrentK()) );
    return activeState;
}