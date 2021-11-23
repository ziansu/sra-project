@java.lang.Override
public void run() {
    try {
        double value = getSafely();
        if (justReset) {
            synchronized(justReset) {
                justReset = false;
            }
            return ;
        }
        if (((output) != null) && (isEnabled())) {
            output.pidWrite(value);
        }
    } catch (java.lang.Exception e) {
        mcException = e;
    }
}