public void setPrice(double price) {
    if (price < 0.0)
        throw new java.lang.IllegalArgumentException(((("Please check the product price. Product name: " + (this.name)) + "  Price: ") + price));
    
    this.price = price;
}