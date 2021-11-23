private boolean timeToReresolve() {
    synchronized(this) {
        return ((lastResolve) + ((5 * 60) * 1000)) < (java.lang.System.currentTimeMillis());
    }
}