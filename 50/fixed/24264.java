public void run() {
    this.exception = null;
    try {
        this.enable();
    } catch (org.jnativehook.NativeHookException e) {
        this.exception = e;
    }
    synchronized(this) {
        this.notifyAll();
    }
}