public java.util.List<java.lang.Integer> getIndexes() {
    java.util.List<java.lang.Integer> indexes = new java.util.ArrayList<>();
    for (int i = 0; i < (filter.length());) {
        int index = filter.nextSetBit(i);
        indexes.add(index);
        i = index + 1;
    }
    return indexes;
}