public Game.Move getUserMove() {
    while (this.userMove.equals(Game.Move.NOMOVE)) {
        java.lang.System.out.println("");
    } 
    Game.Move moveMade = userMove;
    this.userMove = Game.Move.NOMOVE;
    return moveMade;
}