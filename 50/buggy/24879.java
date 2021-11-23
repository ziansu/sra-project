private boolean ValidDelay(int low, int hi) {
    return ((low < hi) && (low >= 5)) && (hi <= 180);
}