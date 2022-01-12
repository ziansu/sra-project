private java.util.List<T> right(int row, int column, int length) {
    java.util.List<T> nodes = new java.util.ArrayList<>();
    int columnCount = columnCount();
    for (int position = 0; position < length; position++) {
        int currentColumn = column + position;
        if (currentColumn >= columnCount) {
            break;
        }
        T node = grid[row][currentColumn];
        nodes.add(node);
    }
    return nodes;
}