@java.lang.Override
public void run() {
    long endtime = (java.lang.System.currentTimeMillis()) + timeLimit;
    try {
        java.lang.Thread.sleep((timeLimit / 1000));
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println("Interrupting worker...");
    con.interrupt();
}