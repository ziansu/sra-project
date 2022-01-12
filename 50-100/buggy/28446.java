public java.lang.String AImove() {
    coup_standalone.AI.Moves nextMove = new coup_standalone.AI.Moves();
    nextMove.updateUtilityWithFacts();
    nextMove.updateUtilityWithHistory();
    nextMove.updateUtilityWithCoins();
    java.lang.String move;
    if ((turn) == 1)
        move = nextMove.firstMove();
    else
        move = nextMove.getMove();
    
    if (move.equals(ASSASSIN))
        myInfo.subCoins(3);
    
    (turn)++;
    (turnsSinceAmbassador)++;
    java.lang.System.out.println(("Move is: " + move));
    return move;
}