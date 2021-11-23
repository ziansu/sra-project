private double nextDouble(long hashCode) {
    hashCode = (2862933555777941757L * hashCode) + 1;
    return ((double) (((int) (hashCode >>> 33)) + 1)) / 2.147483648E9;
}