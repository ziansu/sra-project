private void doFindMoveTest(boolean expectMove) {
    try {
        com.fluxchess.jcpi.models.GenericMove selectedMove = classUnderTest.findMove();
        if (expectMove)
            assertTrue(selectedMove.equals(expectedMove));
        else
            assertFalse(selectedMove.equals(expectedMove));
        
    } catch (eubos.board.NoLegalMoveException e) {
        fail();
    }
}