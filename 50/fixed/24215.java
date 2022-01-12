public int pop() {
    final int result = innerPop();
    if (result != (-1)) {
        usedIndices.add(result);
        updateNumUnusedIndices();
        updateNumUsedIndices();
    }
    return result;
}