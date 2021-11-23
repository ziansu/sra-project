private void addRow(int row, int numInRow) {
    int idxInRow = 0;
    int startVertex = row * numInRow;
    int currVertex = startVertex;
    while (idxInRow < numInRow) {
        addFace(currVertex, (currVertex + 1), ((currVertex + numInRow) + 1), (currVertex + numInRow));
        currVertex++;
        idxInRow++;
    } 
}