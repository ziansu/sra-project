public short getMapIdAtReverseY(int index) {
    int col = index % (columnCount);
    int row = index / ((rowCount) - 1);
    java.lang.System.out.println(((((col + " : ") + row) + " (") + index));
    return getMapIdAt(col, (((rowCount) - row) - 1));
}