private void accept() {
    (sourcePos.charFinish)++;
    if ((currentChar) == '\t') {
        ColumnNumber += 7;
    }
    currentChar = sourceFile.getNextChar();
    (ColumnNumber)++;
    if ((currentChar) == '\n') {
        (LineNumber)++;
        ColumnNumber = 0;
    }
}