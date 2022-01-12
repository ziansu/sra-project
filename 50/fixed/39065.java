protected int insertCoin(uebung08.Coin coin) {
    if (isValidValue(coin.getValue())) {
        return coin.getValue();
    }
    return 0;
}