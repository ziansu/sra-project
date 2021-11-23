public int nextIntRange(int i1, int i2) {
    int min = java.lang.Math.min(i1, i2);
    int max = java.lang.Math.max(i1, i2);
    int diff = java.lang.Math.abs((max - min));
    return min + (nextInt((diff > 0 ? diff : 1)));
}