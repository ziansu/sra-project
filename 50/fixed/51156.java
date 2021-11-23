public synchronized void removeListener(net.sf.jukebox.sem.EventListener target) {
    if (target == null) {
        throw new java.lang.IllegalArgumentException("null argument");
    }
    listenerSet.remove(target);
}