static java.util.List addPairs(int index) {
    java.util.List<java.lang.Integer> newPairs = new java.util.ArrayList<>();
    for (int i = 1; i < index; i++) {
        if (PrimePairs.isConcatenable(i, index)) {
            newPairs.add(i);
        }
    }
    PrimePairs.pairsList.add(index, newPairs);
    return newPairs;
}