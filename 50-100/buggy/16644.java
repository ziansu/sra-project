private void setNewColumn(int newColumn) {
    if (newColumn >= (nextNonSpaceColumn)) {
        index = nextNonSpace;
        column = nextNonSpaceColumn;
    }
    while (((column) < newColumn) && ((index) != (line.length()))) {
        advance();
    } 
}