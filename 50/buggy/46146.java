private void addPhotoFace(int x, int y) {
    int rowCount = 0;
    while (rowCount < y) {
        addRow(rowCount, x);
        rowCount++;
    } 
}