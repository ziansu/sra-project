public double get(int row, int column) {
    int index = java.util.Arrays.binarySearch(colInd, rowPtr[row], rowPtr[(row + 1)], column);
    if (index >= 0)
        return rowData[index];
    else
        return 0;
    
}