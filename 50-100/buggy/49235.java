@java.lang.Override
public boolean take() {
    boolean result = false;
    synchronized(monitor) {
        if (taken) {
            try {
                monitor.wait();
            } catch (java.lang.InterruptedException e) {
                throw new java.lang.AssertionError(("Interrupt aufgetreten: Sollte " + "höchstens bei der Terminierung auftreten!"));
            }
            if (!(taken)) {
                taken = true;
                result = true;
            }
        }
    }
    return result;
}