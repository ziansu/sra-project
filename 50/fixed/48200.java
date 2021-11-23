@java.lang.Override
public void resume() {
    state = SynchronizationState.ACTIVE;
    assertTransactionCurrentAndActive();
}