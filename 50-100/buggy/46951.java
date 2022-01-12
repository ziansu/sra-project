public int call() {
    hand.addToPot(((minimumBet) - (streetMoney)));
    spendMoney(((minimumBet) - (streetMoney)));
    if (((streetIn) != 12) && (this.endAction)) {
        game.players.get(otherPlayerID).addMessage(((("gen" + (this.name)) + " called ") + (minimumBet)));
    }
    return minimumBet;
}