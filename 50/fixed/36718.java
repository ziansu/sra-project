public int gridColumnIndexToResultSetColumnIndex(int gridColumnIndex, int rowStyleColumnIndex) {
    int rsColumnIndex = gridColumnIndex;
    if ((rowStyleColumnIndex == 0) && (gridColumnIndex >= rowStyleColumnIndex))
        rsColumnIndex++;
    
    return rsColumnIndex;
}