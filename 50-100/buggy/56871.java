private int numberOfCoins() {
    int coins = ((int) ((getCoinMultiplier()) * 100)) / 100;
    if (extraCoin((((int) ((getCoinMultiplier()) * 100)) % 100))) {
        return coins + 1;
    }else {
        return coins;
    }
}