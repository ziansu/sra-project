@org.junit.Test(expected = hanto.common.HantoException.class)
public void resignOnThirdMove() throws hanto.common.HantoException {
    hanto.common.MoveResult mr = game.makeMove(HantoPieceType.CRAB, null, makeCoordinate(0, 0));
    org.junit.Assert.assertEquals(hanto.common.MoveResult.OK, mr);
    game.makeMove(HantoPieceType.CRAB, null, makeCoordinate(1, 0));
    org.junit.Assert.assertEquals(hanto.common.MoveResult.OK, mr);
    mr = game.makeMove(null, null, null);
}