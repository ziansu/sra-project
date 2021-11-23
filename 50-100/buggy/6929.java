public Key delMax() {
    Key max = pq[1];
    pq[1] = pq[N];
    pq[N] = null;
    sink();
    utils.Utils.resizeArray(pq, (--(N)));
    return max;
}