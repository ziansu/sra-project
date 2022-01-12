public double getBuyPrice() {
    double sellPrice = getSellPrice();
    sellPrice += sellPrice * (this.markup);
    return java.lang.Math.min(com.gmail.haloinverse.DynamicMarket.util.Util.round(sellPrice, 2), this.maxPrice);
}