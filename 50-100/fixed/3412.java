@org.junit.Test
public void testUndoSectionWinningMove() {
    com.diusrex.tictactoe.data_structures.position.SectionPosition sectionToWin = com.diusrex.tictactoe.data_structures.position.SectionPosition.make(0, 0);
    winSection(sectionToWin, mainPlayer);
    org.junit.Assert.assertEquals(mainPlayer, board.getSectionOwner(sectionToWin));
    board.undoLastMove();
    org.junit.Assert.assertEquals(Player.Unowned, board.getSectionOwner(sectionToWin));
    org.junit.Assert.assertEquals(null, board.getSectionWinLine(sectionToWin));
}