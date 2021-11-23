public void addToIndex(final int documentIndex, final int index, final T value) {
    matrix.get(documentIndex).add(index, value);
}