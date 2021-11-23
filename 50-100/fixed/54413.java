@java.lang.Override
public void documentChanged(com.intellij.openapi.editor.event.DocumentEvent event) {
    int startLine = myDocument.getLineNumber(event.getOffset());
    int newEndLine = getAdjustedLineNumber(((event.getOffset()) + (event.getNewLength())));
    invalidateLines(startLine, myDocumentChangeOldEndLine, newEndLine, true, com.intellij.openapi.editor.impl.view.LineLayout.isBidiLayoutRequired(event.getNewFragment()));
}