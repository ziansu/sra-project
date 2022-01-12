@java.lang.Override
public boolean take() {
    boolean result = false;
    synchronized(monitor) {
        if (taken) {
            try {
                monitor.wait();
            } catch (java.lang.InterruptedException e) {
            }
        }
        if (!(taken)) {
            taken = true;
            result = true;
        }
    }
    return result;
}