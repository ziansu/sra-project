private int numberOfCoins() {
    java.lang.System.out.println(getCoinMultiplier());
    int coins = ((int) ((getCoinMultiplier()) * 100)) / 100;
    if (extraCoin((((int) ((getCoinMultiplier()) * 100)) % 100))) {
        coins++;
        return coins;
    }else {
        return coins;
    }
}