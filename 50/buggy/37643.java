@java.lang.Override
public java.lang.Boolean loadInBackground() {
    boolean res = verification.check();
    try {
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return res;
}