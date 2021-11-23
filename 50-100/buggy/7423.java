private void nextTurn() {
    try {
        java.lang.Thread.sleep(10000, 0);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
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