public short getMapIdAtReverseY(int index) {
    int x = index % (columnCount);
    int y = index / (columnCount);
    java.lang.System.out.println(((((x + " : ") + (((rowCount) - y) - 1)) + " (") + index));
    return getMapIdAt(x, (((rowCount) - y) - 1));
}