public void testTextStartEndWithSelection() throws java.lang.Exception {
    prepareText("RR");
    myEditor.getCaretModel().moveToOffset(1);
    executeAction(IdeActions.ACTION_EDITOR_TEXT_START_WITH_SELECTION);
    assertVisualCaretLocation(0, false);
    checkResult("<selection>R</selection>R");
    executeAction(IdeActions.ACTION_EDITOR_TEXT_END_WITH_SELECTION);
    assertVisualCaretLocation(2, false);
    checkResult("R<selection>R</selection>");
}