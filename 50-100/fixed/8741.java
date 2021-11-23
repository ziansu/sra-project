private void addRow(int row, int numInRow) {
    int idxInRow = 0;
    int startVertex = (row * numInRow) + 1;
    int currVertex = startVertex;
    while (idxInRow < (numInRow - 1)) {
        addFace(currVertex, (currVertex + 1), (currVertex + numInRow));
        addFace((currVertex + 1), ((currVertex + numInRow) + 1), (currVertex + numInRow));
        currVertex++;
        idxInRow++;
    } 
}