private int lineToY(int line) {
    int h = textArea.getVisibleRect().height;
    float lineCount = textArea.getLineCount();
    return ((int) (((line - 1) / (lineCount - 1)) * h)) - 2;
}