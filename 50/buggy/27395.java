@java.lang.Override
public void run() {
    try {
        progress.setMessage("Installing Python...");
        installPython();
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}