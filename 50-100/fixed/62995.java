protected static int getIndexOfHeighestHeight(java.util.LinkedHashMap<java.lang.Integer, java.util.List<java.lang.Integer>> heigthsTempStorage) {
    int size = heigthsTempStorage.size();
    int heighestHeight = 0;
    int indexOfHeighestHeight = 0;
    for (int x = 0; x < size; x++) {
        int heigthsTempStorage_ = heigthsTempStorage.get(x).get(0);
        if (heighestHeight <= heigthsTempStorage_) {
            heighestHeight = heigthsTempStorage_;
            indexOfHeighestHeight = x;
        }
    }
    return indexOfHeighestHeight;
}