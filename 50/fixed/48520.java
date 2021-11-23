public void addToIndex(final int documentIndex, final int index, final T value) {
    matrix.get(documentIndex).set(index, value);
}