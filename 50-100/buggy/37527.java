private int findSingleCommon(int[] sqList, int[] rowList, int[] colList) throws java.lang.Exception {
    if (!(isInitialized)) {
        throw new java.lang.Exception("Class not initialized, playfield not set");
    }
    int[] result = findCommons(sqList, rowList, colList);
    if (result != null) {
        if ((result.length) == 1)
            return result[0];
        else
            return 0;
        
    }
    return 0;
}