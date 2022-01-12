@java.lang.Override
public void startTurn(java.util.concurrent.Semaphore s) {
    s.release();
}