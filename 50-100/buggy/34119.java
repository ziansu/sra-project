public void testHomeEndWithSelection() throws java.lang.Exception {
    prepareText("RR");
    myEditor.getCaretModel().moveToOffset(1);
    homeWithSelection();
    com.intellij.openapi.editor.impl.EditorRtlTest.assertVisualCaretLocation(0, false);
    checkResult("<selection>R</selection>R");
    endWithSelection();
    com.intellij.openapi.editor.impl.EditorRtlTest.assertVisualCaretLocation(2, false);
    checkResult("R<selection>R</selection>");
}