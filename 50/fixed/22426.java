public void ControllerConnectionAbort() {
    synchronized(this) {
        if ((initOk) == true) {
            nativeControllerConnectionAbort(nativeARDiscoveryConnection);
        }
    }
}