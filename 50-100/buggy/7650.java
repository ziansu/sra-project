public int nextInt(int max_exclusive) {
    seed ^= (seed) << 21;
    seed ^= (seed) >>> 35;
    seed ^= (seed) << 4;
    return ((int) ((java.lang.Math.abs(((seed) % max_exclusive))) + 1));
}