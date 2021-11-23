@java.lang.Override
public void myTurn() {
    board.printToConsole();
    boolean moveValid = false;
    while (moveValid == false) {
        java.lang.System.out.println((("Player " + (number)) + " it is your turn."));
        java.lang.System.out.print("Please enter the row you would like to place your piece in? ");
        int row = Game.scanner.nextInt();
        java.lang.System.out.print("Please enter the column you would like to place your piece in? ");
        int col = Game.scanner.nextInt();
        if ((game.doMove(row, col)) == false) {
            java.lang.System.out.println("Invalid move. Please try again");
        }else {
            moveValid = true;
        }
    } 
}