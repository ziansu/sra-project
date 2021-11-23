private static int findMinStartingAt(int startIndex, adt.interfaces.AdtArray array) {
    int minIndex = startIndex;
    for (int i = startIndex + 1; i < (array.length()); i++) {
        if ((array.get(i)) < (array.get(minIndex))) {
            minIndex = i;
        }
    }
    return minIndex;
}