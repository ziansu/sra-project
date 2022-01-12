private static int char_compare(int index1, int index2) {
    return sharedDataSolution.main.getStrFromAlphabetizedMatrix(index1).toUpperCase().compareTo(sharedDataSolution.main.getStrFromAlphabetizedMatrix(index2).toUpperCase());
}