@java.lang.Override
public void startTurn(java.util.concurrent.Semaphore s) {
    java.lang.System.out.println("Now accepting card presses");
    s.release();
}