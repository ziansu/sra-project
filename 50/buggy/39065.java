protected boolean insertCoin(uebung08.Coin coin) {
    if (isValidValue(coin.getValue())) {
        return true;
    }
    return false;
}