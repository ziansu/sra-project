private int getValidLineNumber(int line, com.intellij.openapi.editor.Document document) {
    int lineCount = getDocumentLineCount(document);
    line = line - 1;
    if (line <= 0) {
        line = 1;
    }else
        if (line >= lineCount) {
            line = lineCount - 1;
        }
    
    return line;
}