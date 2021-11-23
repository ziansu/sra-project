public Key delMax() {
    Key max = pq[1];
    pq[1] = pq[N];
    pq[N] = null;
    (N)--;
    sink();
    pq = ((Key[]) (utils.Utils.resizeArray(pq, ((N) + 1))));
    return max;
}