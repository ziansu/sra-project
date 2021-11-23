private void awaitLoadedLocked() {
    if (!(mLoaded)) {
    }
    while (!(mLoaded)) {
        try {
            wait();
        } catch (java.lang.InterruptedException unused) {
        }
    } 
}