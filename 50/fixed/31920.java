private boolean timeToReresolve() {
    synchronized(this) {
        return ((lastResolve) + ((1 * 60) * 1000)) < (java.lang.System.currentTimeMillis());
    }
}