public void adjustOffset(int lineOffset, int columnOffset, int charOffset) {
    this.lineNumber += lineOffset;
    this.column += columnOffset;
    this.startOffset += charOffset;
    this.endOffset += charOffset;
}