private int findEndOfExistDirIndex(java.lang.String[] pathCells) {
    int endOfExistDirIndex = 0;
    java.io.File path = new java.io.File("");
    for (int i = 0; i < (pathCells.length); ++i) {
        endOfExistDirIndex = i;
        java.lang.String pathCell = pathCells[i];
        path = new java.io.File(path, pathCell);
        if (isFileExist(path)) {
            break;
        }
    }
    return endOfExistDirIndex;
}