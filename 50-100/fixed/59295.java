public int pivot(int[] x) {
    int lo = 0;
    int hi = (x.length) - 1;
    int mid = (lo + hi) / 2;
    if ((x[lo]) < (x[hi])) {
        return 0;
    }
    return pivot(x, 0, ((x.length) - 1));
}