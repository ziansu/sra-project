private java.lang.String[] removeEmptyEntries(java.lang.String[] queryParts) {
    int emptyCount = 0;
    for (java.lang.String queryPart : queryParts) {
        if ((queryPart.length()) == 0)
            emptyCount++;
        
    }
    java.lang.String[] trimmedArray = new java.lang.String[(queryParts.length) - emptyCount];
    int trimIndex = 0;
    for (java.lang.String queryPart : queryParts) {
        if ((queryPart.length()) != 0) {
            trimmedArray[trimIndex] = queryPart;
            trimIndex++;
        }
    }
    return trimmedArray;
}