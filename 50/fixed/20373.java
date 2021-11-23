public boolean invalidUpdateIndexAtIs(int index, long expectedIndex) {
    return (invalidUpdateIndexes.get(index).getValue()) == expectedIndex;
}