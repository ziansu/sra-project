public void bet(int amount) {
    table.setCurrentBet(((table.getCurrentBet()) + amount));
    if ((money) > amount) {
        table.addToPot(totalBet, amount);
        totalBet += amount;
        currentBet += amount;
        addMoney((-amount));
        table.setLastBetId(id);
    }else {
        allIn();
        table.setLastBetId(table.nextPlayer(id));
        table.setDelayNextGameState(true);
    }
}