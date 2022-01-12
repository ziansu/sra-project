public com.flower.Flower createFlower(com.flower.FlowerType flowerType, double stemLength, java.util.Date date) {
    double price;
    if (prices.containsKey(flowerType))
        price = prices.get(flowerType);
    else
        throw new java.lang.IllegalArgumentException();
    
    return createFlower(flowerType, stemLength, price, date);
}