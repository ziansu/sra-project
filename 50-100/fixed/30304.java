public void testMovingThroughBoundaryBetweenRunsWithNonadjacentLevels() throws java.lang.Exception {
    prepareText("R=1");
    right();
    assertVisualCaretLocation(0, false);
    assertEquals(2, myEditor.getCaretModel().getOffset());
    right();
    assertVisualCaretLocation(1, false);
    assertEquals(3, myEditor.getCaretModel().getOffset());
    right();
    assertVisualCaretLocation(1, true);
    assertEquals(2, myEditor.getCaretModel().getOffset());
}