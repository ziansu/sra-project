public java.util.ArrayList<Coin> returnCoins(java.util.ArrayList<Coin> coins, Product product) {
    double difference = calcChangeDue(coins, product);
    while (difference > 0)
        if (difference >= 0.25) {
            quarterBank.remove(0);
            Quarter quarter = new Quarter();
            coinsToReturn.add(quarter);
        }
    
    return coinsToReturn;
}