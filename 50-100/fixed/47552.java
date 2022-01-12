public void addEntry(int i, double d) {
    if (vector.containsKey(i)) {
        return ;
    }
    if ((nextAvailable) >= (size)) {
        throw new java.lang.RuntimeException("Vector size overrun");
    }
    nextAvailable = i + 1;
    if (d == 0.0) {
        return ;
    }
    vector.put(i, d);
}