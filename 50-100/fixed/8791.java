private java.util.List<T> down(int row, int column, int length) {
    java.util.List<T> nodes = new java.util.ArrayList<>();
    int rowCount = rowCount();
    for (int position = 0; position < length; position++) {
        int currentRow = row + position;
        if (currentRow >= rowCount) {
            break;
        }
        T node = grid[currentRow][column];
        nodes.add(node);
    }
    return nodes;
}