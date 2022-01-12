@org.junit.Test(expected = johnholiver.game.move.exceptions.MoveException.class)
public void moveNotOwnerTest() throws java.lang.Exception {
    johnholiver.game.move.Place move1 = new johnholiver.game.move.Place(board, p1, 0, 0, johnholiver.game.piece.PieceType.STANDINGSTONE);
    java.util.List<java.lang.Integer> drop = new java.util.ArrayList<java.lang.Integer>();
    drop.add(0);
    drop.add(1);
    johnholiver.game.move.Move move2 = new johnholiver.game.move.Move(board, p2, 0, 0, johnholiver.game.move.Direction.DOWN, drop);
    board.executeMove(move1);
    board.executeMove(move2);
}