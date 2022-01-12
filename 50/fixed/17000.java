public void setPlayerBet(double playerBet) {
    if (playerBet > (this.getBalance())) {
        playerBet = this.getBalance();
        this.setPlayerBet(playerBet);
    }else {
        this.playerBet = playerBet;
    }
}