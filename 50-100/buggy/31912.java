@org.junit.Test
public void testIsDead_BonusSquare() {
    fr.istic.vv.simpleGame.core.Pawn pawn1 = new fr.istic.vv.simpleGame.core.Pawn('z', 3, 4, board);
    fr.istic.vv.simpleGame.core.Pawn pawn2 = new fr.istic.vv.simpleGame.core.Pawn('y', 3, 3, board);
    board.addPawn(pawn1);
    board.addPawn(pawn2);
    try {
        pawn2.move(Direction.Up);
    } catch (fr.istic.vv.simpleGame.exception.OutOfBoardException e) {
        e.printStackTrace();
    }
    assertTrue(pawn1.isDead());
}