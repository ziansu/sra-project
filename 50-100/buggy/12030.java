@org.junit.Test
public void should_provide_cell_with_matching_colours() throws java.lang.Exception {
    final org.binu.board.Block redYellowBlock = dataParser.createColourBlock(5, 4);
    assertBlockData(redYellowBlock, CellColour.RED, CellColour.YELLOW);
    final org.binu.board.Block greenPurpleBlock = dataParser.createColourBlock(3, 2);
    assertBlockData(greenPurpleBlock, CellColour.GREEN, CellColour.PURPLE);
    final org.binu.board.Block blueGreenBlock = dataParser.createColourBlock(2, 1);
    assertBlockData(blueGreenBlock, CellColour.BLUE, CellColour.GREEN);
}