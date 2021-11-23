private void drawBoardDisplay(org.client.Board b) {
    java.lang.System.out.println("Drawing board");
    java.awt.Graphics g = this.getGraphics();
    clearBoardDisplay(g);
    drawGrid(g);
    java.lang.System.out.println(("current board is null? " + ((currentBoard) == null)));
    if ((currentBoard) == null)
        return ;
    
    drawPieces(g, currentBoard);
}