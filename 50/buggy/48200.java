@java.lang.Override
public void resume() {
    assertTransactionCurrentAndActive();
    state = SynchronizationState.ACTIVE;
}