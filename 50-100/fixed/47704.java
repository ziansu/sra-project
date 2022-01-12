public void call() {
    int amountToBet = (table.getCurrentBet()) - (currentBet);
    if (((money) - amountToBet) > 0) {
        totalBet += amountToBet;
        currentBet += amountToBet;
        addMoney((-amountToBet));
        table.addToPot(totalBet, amountToBet);
    }else {
        allIn();
    }
}