public void testMovingIntoVirtualSpace() throws java.lang.Exception {
    prepareText("R");
    myEditor.getSettings().setVirtualSpace(true);
    com.intellij.openapi.editor.impl.EditorRtlTest.assertVisualCaretLocation(0, false);
    right();
    com.intellij.openapi.editor.impl.EditorRtlTest.assertVisualCaretLocation(0, true);
    right();
    com.intellij.openapi.editor.impl.EditorRtlTest.assertVisualCaretLocation(1, true);
    right();
    com.intellij.openapi.editor.impl.EditorRtlTest.assertVisualCaretLocation(1, false);
    right();
    com.intellij.openapi.editor.impl.EditorRtlTest.assertVisualCaretLocation(2, false);
    right();
    com.intellij.openapi.editor.impl.EditorRtlTest.assertVisualCaretLocation(3, false);
}