public void bet(int amount) {
    table.setCurrentBet(((table.getCurrentBet()) + amount));
    if ((money) > amount) {
        totalBet += amount;
        currentBet += amount;
        addMoney((-amount));
        table.addToPot(totalBet, amount);
        table.setLastBetId(id);
    }else {
        allIn();
        table.setLastBetId(table.nextPlayer(id));
        table.setDelayNextGameState(true);
    }
}