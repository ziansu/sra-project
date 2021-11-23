boolean restartProcess(net.algart.pyramid.http.JavaProcessControlWithHttpCheckingAliveStatus control, boolean skipIfAlive) throws java.io.IOException {
    synchronized(lock) {
        if (skipIfAlive && (control.areAllHttpServicesAlive(true))) {
            return false;
        }
        stopProcess(control, false);
        startProcess(control, false);
        return true;
    }
}