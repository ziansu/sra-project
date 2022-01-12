private void assertBlockData(org.binu.board.Block block, org.binu.data.CellColour firstColour, org.binu.data.CellColour secondColour) {
    final org.binu.board.Cell[] cells = block.getCells();
    final org.binu.data.CellColour bottomCellColour = cells[0].getCellColour();
    final org.binu.data.CellColour topCellColour = cells[1].getCellColour();
    org.junit.Assert.assertThat(("Bottom cell should be " + firstColour), bottomCellColour, is(firstColour));
    org.junit.Assert.assertThat(("Top cell should be " + secondColour), topCellColour, is(secondColour));
}