public T nearestNeighbour(T query) {
    double min = java.lang.Double.POSITIVE_INFINITY;
    T nn = null;
    for (T curr : this.testData) {
        double dist = this.distance.distance(curr, query);
        if (dist < min) {
            min = dist;
            nn = curr;
        }
    }
    return nn;
}