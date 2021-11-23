public java.util.List<java.lang.Integer> getIndexes() {
    java.util.List<java.lang.Integer> indexes = new java.util.ArrayList<>();
    for (int i = filter.nextSetBit(0); i >= 0; i = filter.nextSetBit((i + 1))) {
        indexes.add(i);
    }
    return indexes;
}