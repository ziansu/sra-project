private void findDoubleOccurrences(int[] firstArray, int[] secondArray, int nExponant) {
    int currentCount = 0;
    for (int i = 0; i < ((firstArray.length) - 1); i++) {
        if ((bs.Search(firstArray[i], secondArray)) != (-1)) {
            currentCount = exercises.BinarySearchQuantities_1_1_139.getOrDefault(doubleOccurrences, nExponant, 0);
            doubleOccurrences.put(nExponant, currentCount);
        }
    }
}