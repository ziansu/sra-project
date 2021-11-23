private synchronized void updateWithTerminated() {
    java.util.Collections.sort(terminated);
    java.util.List<java.lang.Integer> toRemove = new java.util.LinkedList<java.lang.Integer>();
    for (java.lang.Integer tid : terminated) {
        if (tid == (minAlive)) {
            ++(minAlive);
            toRemove.add(tid);
        }else {
            break;
        }
    }
    for (java.lang.Integer tid : toRemove) {
        terminated.remove(tid);
    }
}