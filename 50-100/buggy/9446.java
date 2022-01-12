public int lngToCol(double lon) {
    if ((lon < (westLng)) || (lon > (eastLng)))
        throw new java.lang.IllegalArgumentException("Longitude is out of map range");
    
    int colIndex = ((int) (((eastLng) - lon) / (cellDegree)));
    if (colIndex >= (numberOfCols))
        throw new java.lang.IndexOutOfBoundsException();
    
    return colIndex;
}