private int hammingInternal() {
    int d = 0;
    for (int i = 1; i < ((N) * (N)); i++) {
        if (isOnTarget(i)) {
        }else {
            d++;
        }
    }
    return d;
}