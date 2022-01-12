public int nextIntRange(int i1, int i2) {
    int min = java.lang.Math.min(i1, i2);
    int max = java.lang.Math.max(i1, i2);
    int diff = max - min;
    if (diff <= 0) {
        return min;
    }
    return min + (nextInt(diff));
}