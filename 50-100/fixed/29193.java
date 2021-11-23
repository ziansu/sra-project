private void generateMatrix() {
    matrix = new java.util.ArrayList<>();
    java.util.List<java.lang.String> contentF1 = abstractContent(1, file01);
    java.util.List<java.lang.String> contentF2 = abstractContent(2, file02);
    checkIfContentCouldMatch(contentF1, contentF2);
    contentCounter = contentF1.size();
    createMatrixIndex();
    createMatrixSchema();
    populateMatrix(contentF1, contentF2);
    printMatrix();
}