private void calculateNumberDeployable() {
    int result = (this.currentPlayer.getTerritories().size()) / 3;
    if (result < 3)
        result = 3;
    
    if (playedCards) {
        result = result + (cardArmies);
        cardArmies = (cardArmies) + ((cardArmies) / 2);
    }
    result = result + (accountForCountries());
    this.numberAllowed = result;
}