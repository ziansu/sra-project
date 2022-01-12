public void call() {
    int amountToBet = (table.getCurrentBet()) - (currentBet);
    if (((money) - amountToBet) > 0) {
        table.addToPot(totalBet, amountToBet);
        totalBet += amountToBet;
        currentBet += amountToBet;
        addMoney((-amountToBet));
    }else {
        allIn();
    }
}