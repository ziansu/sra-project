public P poll() {
    if (isEmpty()) {
        if (pairs.isEmpty()) {
            return null;
        }
        rebuildQueue();
    }
    int curr = 0;
    java.util.LinkedList<P> front = fronts[(curr++)];
    while (curr <= (fronts.length)) {
        if ((front.size()) > 0) {
            return front.removeFirst();
        }
        front = fronts[(curr++)];
    } 
    return null;
}