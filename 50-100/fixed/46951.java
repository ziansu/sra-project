public int call() {
    hand.addToPot(((minimumBet) - (streetMoney)));
    spendMoney(((minimumBet) - (streetMoney)));
    game.players.get(otherPlayerID).addMessage(((("gen" + (this.name)) + " called ") + (minimumBet)));
    return minimumBet;
}