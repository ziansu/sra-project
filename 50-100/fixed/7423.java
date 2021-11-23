private void nextTurn() {
    if ((turn) == (players_turn)) {
        java.lang.System.out.println("NonPlayer ist am Zug");
        turn = nonplayers_turn;
        nonplayersTurn();
        actionKI();
    }else
        if ((turn) == (nonplayers_turn)) {
            java.lang.System.out.println("Player ist am Zug");
            turn = players_turn;
            playersTurn();
        }
    
}