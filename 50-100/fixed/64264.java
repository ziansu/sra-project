private int hammingInternal() {
    int d = 0;
    for (int i = 0; i < ((N) * (N)); i++) {
        if (isOnTarget(i)) {
        }else {
            d++;
        }
    }
    return d;
}