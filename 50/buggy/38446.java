@java.lang.Override
public void run() {
    if ((isFinishing()) || (manualslp)) {
        t.interrupt();
    }
    getLocation(autoLocation);
    getApi();
}