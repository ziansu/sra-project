private static com.intellij.openapi.editor.VisualPosition correctFor0BasedVS1Based(com.intellij.openapi.editor.VisualPosition pos0Based) {
    if (pos0Based == null) {
        return null;
    }
    return new com.intellij.openapi.editor.VisualPosition(((pos0Based.line) + 1), ((pos0Based.column) + 1));
}