public void testMovingThroughBoundaryBetweenRunsWithNonadjacentLevels() throws java.lang.Exception {
    prepareText("R=1");
    right();
    com.intellij.openapi.editor.impl.EditorRtlTest.assertVisualCaretLocation(0, false);
    assertEquals(2, myEditor.getCaretModel().getOffset());
    right();
    com.intellij.openapi.editor.impl.EditorRtlTest.assertVisualCaretLocation(1, false);
    assertEquals(3, myEditor.getCaretModel().getOffset());
    right();
    com.intellij.openapi.editor.impl.EditorRtlTest.assertVisualCaretLocation(1, true);
    assertEquals(2, myEditor.getCaretModel().getOffset());
}