public void startGame() {
    while (!(isGameOver())) {
        deal();
        buildGame(GameInfo.players, GameInfo.middleCard);
        if (pickUpOrPass()) {
            for (int i = 0; i < 5; i++) {
                playCard();
            }
        }else {
            if (chooseSuit()) {
                for (int i = 0; i < 5; i++) {
                    playCard();
                }
            }else {
                break;
            }
        }
    } 
}