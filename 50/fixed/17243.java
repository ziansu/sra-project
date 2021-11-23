@java.lang.Override
public double getSalePrice() {
    setSellPrice(((getSellPrice()) + ((getNumCondients()) * (Sandwich.pricePerCondiment))));
    return getSellPrice();
}