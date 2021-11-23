@java.lang.Override
public double getSalePrice() {
    setSellPrice(((getSalePrice()) + ((getNumCondients()) * (Sandwich.pricePerCondiment))));
    return getSellPrice();
}