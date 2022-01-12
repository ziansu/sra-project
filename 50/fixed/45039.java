public int positionFor(int line, int column) {
    return (lines.get((line - 1))) + column;
}