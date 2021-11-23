@java.lang.Override
public void run() {
    getLocation(autoLocation);
    getApi();
    if ((isFinishing()) || (manualslp)) {
        t.interrupt();
    }
}