@java.lang.Override
public dameo.move.Move selectMove(dameo.gametree.State s) {
    dameo.players.HumanPlayer.MoveSelectFrame frame = new dameo.players.HumanPlayer.MoveSelectFrame();
    frame.setSize(200, 200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    java.util.Set<dameo.move.Move> moves = dameo.DameoEngine.generateLegalMoves(s);
    dameo.move.Move m = frame.getPlayerMoveInput(moves);
    return m;
}