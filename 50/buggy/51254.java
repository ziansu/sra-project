protected com.intellij.ui.awt.RelativePoint getPointFromVisualPosition(com.intellij.openapi.editor.Editor editor, com.intellij.openapi.editor.VisualPosition logicalPosition) {
    java.awt.Point p = editor.visualPositionToXY(new com.intellij.openapi.editor.VisualPosition(((logicalPosition.line) + 1), logicalPosition.column));
    return new com.intellij.ui.awt.RelativePoint(editor.getContentComponent(), p);
}