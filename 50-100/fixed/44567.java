private void accept() {
    sourcePos.charFinish = ColumnNumber;
    if ((currentChar) == '\t') {
        ColumnNumber += 7;
    }
    (ColumnNumber)++;
    if ((currentChar) == '\n') {
        (LineNumber)++;
        ColumnNumber = 1;
    }
    currentChar = sourceFile.getNextChar();
}