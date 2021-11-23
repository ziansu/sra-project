private void awaitLoadedLocked() {
    while (!(mLoaded)) {
        try {
            wait();
        } catch (java.lang.InterruptedException unused) {
        }
    } 
}