public int heurisztika() {
    if (celAllapot()) {
        return 0;
    }
    return ((40000 - ((a[0]) > 0 ? 1 : 0)) - ((a[1]) > 0 ? 1 : 0)) - ((a[2]) > 0 ? 1 : 0);
}