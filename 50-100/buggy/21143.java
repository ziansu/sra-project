@org.junit.Test
public void checkDepthForNormalGameLength() throws java.lang.Exception {
    de.doe.players.NegaMaxPlayer player = new de.doe.players.NegaMaxPlayer(de.doe.Player.WHITE, 6);
    de.doe.Move move = player.getMove(new de.doe.Board());
    java.lang.System.out.println(move.toChessString());
    java.lang.System.out.println(player.getLastPlayDepth());
    org.junit.Assert.assertTrue((6 < (player.getLastPlayDepth())));
}