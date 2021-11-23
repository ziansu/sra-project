public void tryMove(java.lang.String dir) {
    main.Player currentPlayer = players.get(turnIndex);
    if (!(canMove())) {
        java.lang.System.out.println("cant move");
        return ;
    }
    move(players.get(turnIndex), dir);
}