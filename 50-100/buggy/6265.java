public static void main(java.lang.String[] arg) throws java.lang.Exception {
    antiChess.AntiChess.initGame(arg[0]);
    antiChess.AntiChess.board.printBoard();
    if (antiChess.AntiChess.chosenPlayer.equals(java.awt.Color.WHITE))
        antiChess.AntiChess.handlePruneAction();
    
    while (true) {
        antiChess.AntiChess.inputAction = new antiChess.MoveAnnotation(antiChess.AntiChess.scanner.nextLine());
        antiChess.AntiChess.handleInputAction();
        antiChess.AntiChess.handlePruneAction();
    } 
}