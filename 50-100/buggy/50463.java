public void updateScore(cs151_rps.Referee.Winner winner) {
    switch (winner) {
        case PLAYER1 :
            thescoreCard.setPlayerOneScore(((thescoreCard.getPlayerOneScore()) + 1));
        case PLAYER2 :
            thescoreCard.setPlayerTwoScore(((thescoreCard.getPlayerTwoScore()) + 1));
        case TIE :
            thescoreCard.setNumOfTies(((thescoreCard.getNumOfTies()) + 1));
    }
}