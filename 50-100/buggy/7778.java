private static int getValidLineNumber(int line, com.intellij.openapi.editor.Document document) {
    int lineCount = net.masterthought.dlanguage.highlighting.annotation.external.CompileCheck.getDocumentLineCount(document);
    line = line - 1;
    if (line <= 0) {
        line = 1;
    }else
        if (line >= lineCount) {
            line = lineCount - 1;
        }
    
    return line;
}