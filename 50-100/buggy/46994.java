public static java.lang.String[][] trimArrayVertically(java.lang.String[][] cellValues, int verticalBound) {
    java.lang.String[][] trimmedArray = new java.lang.String[verticalBound][];
    for (int i = 0; i <= verticalBound; i++) {
        trimmedArray[(i - 1)] = new java.lang.String[cellValues[i].length];
        trimmedArray[(i - 1)] = cellValues[i];
    }
    return trimmedArray;
}