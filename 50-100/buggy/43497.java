public static void main(java.lang.String[] args) {
    board x = new board();
    java.lang.System.out.println(x);
    while ((x.gameOver) == false) {
        x.choosePieceSpace();
        x.chooseMoveSpace();
        x.doMove();
        x.Gameover();
        java.lang.System.out.println(x);
        x.computerMove();
        x.Gameover();
        java.lang.System.out.println(x);
    } 
}