public void set(int startLine, int startColumn, int startIndex, int endIndex) {
    this.line = startLine;
    this.column = startColumn;
    this.startIndex = startIndex;
    this.endIndex = endIndex;
    this.length = (endIndex - startIndex) + 1;
}