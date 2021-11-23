public int increasePrice(int oldPrice, int upgradeAmount) {
    if (upgradeAmount == 0) {
        return oldPrice;
    }else {
        int newPrice = oldPrice * (2 * upgradeAmount);
        return newPrice;
    }
}