public void testMovingIntoVirtualSpace() throws java.lang.Exception {
    prepareText("R");
    myEditor.getSettings().setVirtualSpace(true);
    assertVisualCaretLocation(0, false);
    right();
    assertVisualCaretLocation(0, true);
    right();
    assertVisualCaretLocation(1, true);
    right();
    assertVisualCaretLocation(1, false);
    right();
    assertVisualCaretLocation(2, false);
    right();
    assertVisualCaretLocation(3, false);
}