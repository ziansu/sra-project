public P poll() {
    if ((isEmpty()) && (pairs.isEmpty())) {
        return null;
    }
    int curr = 0;
    java.util.LinkedList<P> front;
    do {
        front = fronts[(curr++)];
        if ((front.size()) > 0) {
            return front.removeFirst();
        }
    } while (curr < (fronts.length) );
    rebuildQueue();
    return poll();
}